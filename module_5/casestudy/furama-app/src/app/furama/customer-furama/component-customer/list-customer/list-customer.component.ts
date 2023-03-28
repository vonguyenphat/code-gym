import {Component, OnInit} from '@angular/core';
import {Customer} from "../../model/customer";
import {CustomerService} from "../../service/customer.service";
import {ModalDismissReasons, NgbModal} from "@ng-bootstrap/ng-bootstrap";
import {CustomerType} from "../../model/customer-type";
import {CustomertypeService} from "../../service/customertype.service";
import {DeleteProductModalComponentComponent} from "../../../service-furama/delete-product-modal-component/delete-product-modal-component.component";
import {CreateCustomerComponent} from "../create-customer/create-customer.component";
import {DeleteCustomerComponent} from "../delete-customer/delete-customer.component";

@Component({
  selector: 'app-list-customer',
  templateUrl: './list-customer.component.html',
  styleUrls: ['./list-customer.component.css']
})
export class ListCustomerComponent implements OnInit {
  closeResult = '';
  customers: Customer[] = [];
  customertypes: CustomerType[] = [];

  constructor(private customerService: CustomerService,
              private customerTypeService: CustomertypeService,
              private modal: NgbModal) {
    this.customerService.getAllCustomer().subscribe(data => {
      this.customers = data;
    }, error => {
    }, () => {
    })
    this.customerTypeService.getAllCustomerType().subscribe(data => {
      this.customertypes = data;
    }, error => {
    }, () => {
    })
  }

  ngOnInit(): void {
  }

  addNewCustomer() {
    const modalRef = this.modal.open(CreateCustomerComponent);
    modalRef.componentInstance.customertypes = this.customertypes;
  }
  deteleCustomer(id:string,name:string){
    const modalRef = this.modal.open(DeleteCustomerComponent);
    modalRef.componentInstance.idDelete = id;
    modalRef.componentInstance.nameDelete = name;
  }



}
