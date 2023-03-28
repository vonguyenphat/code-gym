import {Component, OnInit} from '@angular/core';
import {ServiceFurama} from "../../../model/service-furama/serviceFurama";
import {ServiceFuramaServiceService} from "../../../service/service-furama/service-furama-service.service";
import {ModalDismissReasons, NgbModal} from '@ng-bootstrap/ng-bootstrap';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {ServiceTypeServiceService} from "../../../service/service-furama/service-type-service.service";
import {RentypeServiceService} from "../../../service/service-furama/rentype-service.service";
import {ServiceDivServiceService} from "../../../service/service-furama/service-div-service.service";
import {ServiceType} from "../../../model/service-furama/serviceType";
import {RentType} from "../../../model/service-furama/rentType";
import {DivService} from "../../../model/service-furama/divService";
import {DeleteProductModalComponentComponent} from "../delete-product-modal-component/delete-product-modal-component.component";
import {EditServiceModalComponentComponent} from "../edit-service-modal-component/edit-service-modal-component.component";


@Component({
  selector: 'app-list-service',
  templateUrl: './list-service.component.html',
  styleUrls: ['./list-service.component.css'],

})
export class ListServiceComponent implements OnInit {
  serviceFuramas: ServiceFurama[];
  closeResult = '';
  typeServices: ServiceType[];
  rentTypes: RentType[];
  divTypeServices: DivService[];
  typeAlert:string;
  messageAlert:string;
  constructor(private serviceFurama: ServiceFuramaServiceService,
              private modalService: NgbModal,
              private typeService: ServiceTypeServiceService,
              private rentTypeService: RentypeServiceService,
              private divService: ServiceDivServiceService) {
  }

  ngOnInit(): void {
    this.getAll();
    this.getAllDivTypeService();
    this.getAllRentTypeService();
    this.getAllTypeService();
  }
  close() {

  }

  openDeleteProductModal(id: number, name: string) {
    const modalRef = this.modalService.open(DeleteProductModalComponentComponent);
    modalRef.componentInstance.serviceId = id;
    modalRef.componentInstance.serviceName = name;
    modalRef.result.then(
      () => {
        this.serviceFurama.deleteServiceById(id);
      },
      () => {
        // Xử lý khi hủy xóa sản phẩm
      });
  }


  serviceFuramaForm = new FormGroup({
    id: new FormControl('', [Validators.required]),
    name: new FormControl('',),
    image: new FormControl('',),
    area: new FormControl('',),
    cost: new FormControl('',),
    peopleMax: new FormControl('',),
    standardRoom: new FormControl('',),
    descriptionOtherConvenience: new FormControl('',),
    areaPool: new FormControl('',),
    numberOfFloors: new FormControl('',),
    rentType: new FormControl('',),
    serviceType: new FormControl('', [Validators.required]),
    serviceDiv: new FormControl('',),
  });

  addNewService() {
    console.log(this.serviceFuramaForm);
    if (this.serviceFuramaForm.valid) {
      this.serviceFurama.saveService(this.serviceFuramaForm.value);
      this.modalService.dismissAll();
    } else {
      alert("Thêm mới thất bại")
    }
    ;
  }

  deleteService(id: number) {
    this.serviceFurama.deleteProduct(id);
  }

  getAllTypeService() {
    this.typeServices = this.typeService.typeServices;
  }

  getAllRentTypeService() {
    this.rentTypes = this.rentTypeService.rentTypes;
  }

  getAllDivTypeService() {
    this.divTypeServices = this.divService.divServices;
  }

  getAll() {
    this.serviceFuramas = this.serviceFurama.getAllSerive();
  }

  delete(id: number, name: string) {
  }

  open(content) {
    this.modalService.open(content, {size: 'xl', ariaLabelledBy: 'modal-basic-title'}).result.then(
      (result) => {
        this.closeResult = `Closed with: ${result}`;
      },
      (reason) => {
        this.closeResult = `Dismissed ${this.getDismissReason(reason)}`;
      },
    );
  }

  private getDismissReason(reason: any): string {
    if (reason === ModalDismissReasons.ESC) {
      return 'by pressing ESC';
    } else if (reason === ModalDismissReasons.BACKDROP_CLICK) {
      return 'by clicking on a backdrop';
    } else {
      return `with: ${reason}`;
    }
  }

  serviceFuramaFind:ServiceFurama;
  editServiceFurama(id: number) {
    this.serviceFuramaFind = this.serviceFurama.findById(id);
    // console.log(this.serviceFuramaFind);
    const modalRef = this.modalService.open(EditServiceModalComponentComponent);
    modalRef.componentInstance.id = id;
    modalRef.componentInstance.typeServices = this.typeServices;
    modalRef.componentInstance.rentTypes = this.rentTypes;
    modalRef.componentInstance.divTypeServices = this.divTypeServices;
    console.log(typeof id);
    console.log(id);
    // modalRef.componentInstance.id = id;
  }
  dimiss() {
    this.modalService.dismissAll();
  }
}
