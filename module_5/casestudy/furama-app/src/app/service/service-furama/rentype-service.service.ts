import {Injectable} from '@angular/core';
import {RentType} from "../../model/service-furama/rentType";

@Injectable({
  providedIn: 'root'
})
export class RentypeServiceService {

  constructor() {
  }

  rentTypes: RentType[] = [
    {
      id: 1,
      name: 'Ngày'
    },
    {
      id:2,
      name:'Tháng'
    },
    {
      id:3,
      name:'Năm'
    }
  ];

}
