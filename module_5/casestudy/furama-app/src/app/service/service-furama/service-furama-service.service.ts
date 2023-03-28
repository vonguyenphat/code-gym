import {Injectable} from '@angular/core';
import {ServiceFurama} from "../../model/service-furama/serviceFurama";

@Injectable({
  providedIn: 'root'
})
export class ServiceFuramaServiceService {

  constructor() {
  }

  serviceFuramas: ServiceFurama[] = [
    {
      id: 1,
      name: 'Villa A1 hướng biển',
      image: 'https://pix10.agoda.net/hotelImages/300/3008435/3008435_17102516300058320044.jpg?ca=6&ce=1&s=1024x768',
      area: 100,
      cost: 100,
      peopleMax: 5,
      standardRoom: 'vip',
      descriptionOtherConvenience: 'Bếp nướng',
      areaPool: 20,
      numberOfFloors: 3,
      rentType: {id: 1, name: 'Ngày'},
      serviceType: {id: 1, name: 'villa'},
      serviceDiv: {id: 2, name: 'Không có'}
    },
    {
      id: 2,
      name: 'House',
      image: 'https://furamavietnam.com/wp-content/uploads/2018/08/Vietnam_Danang_Furama_Villas_Beach_Pool_Villas-_Exterior-1-F-871x563.jpg',
      area: 100,
      cost: 100,
      peopleMax: 5,
      standardRoom: 'vip',
      descriptionOtherConvenience: '',
      numberOfFloors: 3,
      rentType: {id: 1, name: 'Tháng'},
      serviceType: {id: 1, name: 'House'},
      serviceDiv: {id: 2, name: 'Không có'}
    },
    {
      id: 3,
      name: 'Phòng riêng',
      image: 'https://furamavietnam.com/wp-content/uploads/2018/08/Vietnam_Danang_Furama_Villas_Beach_Pool_Villas_Bedroom-1-1047x563.jpg',
      area: 100,
      cost: 100,
      peopleMax: 5,
      rentType: {
        id: 1, name: 'năm'},
      serviceType: {id: 1, name: 'Phòng riêng'},
      serviceDiv: {id: 1, name: 'karaoke'}
    }
  ];

  getAllSerive() {
    return this.serviceFuramas;
  }

  saveService(service) {
    this.serviceFuramas.push(service);
  }

  findById(id: number): any {
    return this.serviceFuramas.find(item => item.id === id);
  }

  updateProduct(id: number, service: ServiceFurama) {
    for (let i = 0; i < this.serviceFuramas.length; i++) {
      if (this.serviceFuramas[i].id === id) {
        this.serviceFuramas[i] = service;
      }
    }
  }

  deleteProduct(id: number) {
    this.serviceFuramas = this.serviceFuramas.filter(service => {
      return service.id !== id;
    });

  }

  deleteServiceById(id: number) {
    const index = this.serviceFuramas.findIndex(item => item.id === id);
    if (index !== -1) {
      this.serviceFuramas.splice(index, 1);
    }
  }
}
