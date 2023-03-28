import {Component, Input, OnInit, TemplateRef, ViewChild} from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {CustomerType} from "../../model/customer-type";
import {ModalDismissReasons, NgbModal} from "@ng-bootstrap/ng-bootstrap";

@Component({
  selector: 'app-create-customer',
  templateUrl: './create-customer.component.html',
  styleUrls: ['./create-customer.component.css']
})
export class CreateCustomerComponent implements OnInit {
  customerForm: FormGroup;
  @Input() customertypes: CustomerType[];

  constructor(private modalService: NgbModal) {
  }

  ngOnInit(): void {
    this.buildForm();
  }

  buildForm() {
    const regexID = /^KH-\d{4}$/;
    const regexIDCard = /^\d{9}$|^\d{12}$/;
    const regexPhone = /^((\+84)|0)?(90|91)\d{7}$/;
    this.customerForm = new FormGroup(
      {
        id: new FormControl('', [Validators.required, Validators.pattern(regexID)]),
        customerName: new FormControl('', [Validators.required, Validators.minLength(3)]),
        birthday: new FormControl('', [Validators.required]),
        gender: new FormControl('', [Validators.required]),
        idCard: new FormControl('', [Validators.required, Validators.pattern(regexIDCard)]),
        phone: new FormControl('', [Validators.required, Validators.pattern(regexPhone)]),
        email: new FormControl('', [Validators.required, Validators.email]),
        customerType: new FormControl('', [Validators.required]),
        address: new FormControl('', [Validators.required]),
      }
    )
  }

  closeModal() {
    this.modalService.dismissAll();
  }

}
