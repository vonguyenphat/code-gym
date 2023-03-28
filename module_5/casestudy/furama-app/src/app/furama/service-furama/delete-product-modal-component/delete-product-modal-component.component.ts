import {Component, Input, OnInit} from '@angular/core';
import {NgbActiveModal} from "@ng-bootstrap/ng-bootstrap";
import {ServiceFuramaServiceService} from "../../../service/service-furama/service-furama-service.service";


@Component({
  selector: 'app-delete-product-modal-component',
  styleUrls: ['./delete-product-modal-component.component.css'],
  template: `
    <div class="modal-header">
      <h4 class="modal-title">Xóa dịch vụ</h4>
      <button type="button" class="close" aria-label="Close" (click)="activeModal.dismiss()">
        <span aria-hidden="true">&times;</span>
      </button>
    </div>
    <div class="modal-body">
      <p>Bạn có chắc chắn muốn xóa sản phẩm "<span style="color:red;">{{serviceName}}"</span>  không?</p>
    </div>
    <div class="modal-footer">
      <button type="button" class="btn btn-primary" (click)="activeModal.dismiss()">Hủy</button>
      <button type="button" class="btn btn-danger" (click)="deleteProduct()">Xóa</button>
    </div>
  `
})
export class DeleteProductModalComponentComponent implements OnInit {
  @Input() serviceId: number;
  @Input() serviceName: string;
  constructor(public activeModal: NgbActiveModal,
              private serviceFurama:ServiceFuramaServiceService) {
  }
  ngOnInit(): void {
  }
  deleteProduct() {
    // Gửi thông tin sản phẩm cần xóa về cho service hoặc component cha để xử lý
    this.activeModal.close();
  }

}
