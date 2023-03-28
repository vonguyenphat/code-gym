import {Component, OnInit} from '@angular/core';
import {DictionaryServiceService} from "../../service/dictionary-service.service";
import {IWord} from "../../model/iword";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-dictionary-detail-component',
  templateUrl: './dictionary-detail-component.component.html',
  styleUrls: ['./dictionary-detail-component.component.css']
})
export class DictionaryDetailComponentComponent implements OnInit {
  wordd: IWord;

  constructor(private dictionaryService: DictionaryServiceService,
              private router: Router,
              private activatedRoute: ActivatedRoute) {
    this.activatedRoute.paramMap.subscribe(next => {
      const word = next.get('word');
      if (word != null) {
        this.wordd = this.dictionaryService.detail(word);
      }
    }, error => {
    }, () => {
    });
  }

  ngOnInit(): void {
  }


}
