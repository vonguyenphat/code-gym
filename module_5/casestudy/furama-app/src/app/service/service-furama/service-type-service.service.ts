import {Injectable} from '@angular/core';
import {ServiceType} from "../../model/service-furama/serviceType";

@Injectable({
  providedIn: 'root'
})
export class ServiceTypeServiceService {

  constructor() {
  }

  typeServices: ServiceType[] = [
    {
      id:1,
      name:'Villa'
    },
    {
      id:2,
      name:'House'
    },
    {
      id:3,
      name:'Phòng riêng'
    }]
}
