import {Injectable} from '@angular/core';
import {DivService} from "../../model/service-furama/divService";

@Injectable({
  providedIn: 'root'
})
export class ServiceDivServiceService {

  constructor() {
  }

  divServices: DivService[] = [
    {
      id: 1,
      name: 'Karaoke'
    },
    {
      id:2,
      name:'Massage'
    },
    {
      id:3,
      name:'Coffee'
    },
    {
      id:4,
      name:'Không có'
    }
  ];
}
