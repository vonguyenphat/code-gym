import {Injectable} from '@angular/core';
import {IWord} from "../model/iword";

@Injectable({
  providedIn: 'root'
})
export class DictionaryServiceService {

  constructor() {
  }

  words: IWord[] = [
    {
      word: 'boy',
      mean: 'Trai'
    },
    {
      word:'good',
      mean:'tốt'
    },
    {
      word:'school',
      mean:'trường học'
    }];
  getAll(){
    return this.words;
  }
  detail(mean:string){
    return   this.words.find(item => item.word == mean);
  }
}
