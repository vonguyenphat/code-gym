import {Component, Input, OnInit} from '@angular/core';
import {NgbModal} from "@ng-bootstrap/ng-bootstrap";
import {CustomerService} from "../../service/customer.service";

@Component({
  selector: 'app-delete-customer',
  templateUrl: './delete-customer.component.html',
  styleUrls: ['./delete-customer.component.css']
})
export class DeleteCustomerComponent implements OnInit {
  @Input() idDelete: string;
  @Input() nameDelete: string;

  constructor(private activeModal: NgbModal,
              private customerService: CustomerService) {
  }

  ngOnInit(): void {
  }

  close() {
    this.activeModal.dismissAll();
  }

  deleteCustomer() {
    this.customerService.deleteCustomer(this.idDelete).subscribe(next => {
        alert("Xóa thàng công");
        this.activeModal.dismissAll();
        
      }, error => {
        console.log("Xóa khách hàng k thành công")
      },
      () => {
      })
  }
}
