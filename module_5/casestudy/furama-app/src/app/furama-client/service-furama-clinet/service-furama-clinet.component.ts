import { Component, OnInit } from '@angular/core';
import {ServiceFuramaServiceService} from "../../service/service-furama/service-furama-service.service";
import {ServiceFurama} from "../../model/service-furama/serviceFurama";

@Component({
  selector: 'app-service-furama-clinet',
  templateUrl: './service-furama-clinet.component.html',
  styleUrls: ['./service-furama-clinet.component.css']
})
export class ServiceFuramaClinetComponent implements OnInit {
  serviceFuramas: ServiceFurama[] = [];
  constructor(private serviceFurama:ServiceFuramaServiceService) { }
  ngOnInit(): void {
    this.getAllService();
  }
  getAllService(){
    this.serviceFuramas = this.serviceFurama.getAllSerive();
  }
}
