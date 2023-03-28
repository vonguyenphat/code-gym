import {Component, Input, OnInit} from '@angular/core';
import {NgbActiveModal} from "@ng-bootstrap/ng-bootstrap";
import {ServiceFurama} from "../../../model/service-furama/serviceFurama";
import {FormBuilder, FormControl, FormGroup, Validators} from "@angular/forms";
import {ServiceType} from "../../../model/service-furama/serviceType";
import {RentType} from "../../../model/service-furama/rentType";
import {DivService} from "../../../model/service-furama/divService";
import {ServiceTypeServiceService} from "../../../service/service-furama/service-type-service.service";
import {RentypeServiceService} from "../../../service/service-furama/rentype-service.service";
import {ServiceDivServiceService} from "../../../service/service-furama/service-div-service.service";
import {ServiceFuramaServiceService} from "../../../service/service-furama/service-furama-service.service";

@Component({
  selector: 'app-edit-service-modal-component',
  styleUrls: ['./edit-service-modal-component.component.css'],
  template: `
    <div class="modal-header">
      <h4 class="modal-title">Chỉnh sữa dịch vụ</h4>
      <button type="button" class="close" aria-label="Close" (click)="activeModal.dismiss()">
        <span aria-hidden="true">&times;</span>
      </button>
    </div>
    <div class="modal-body">
      <form [formGroup]="serviceFuramaForm">
        <div class="row">
          <div class="col-6">
            <label class="tilte-input-modal-addNew">ID dịch vụ: </label>
            <input type="text" class="form-control input-modal-addNew" formControlName="id" disabled>
            <span class="errormessage"
                  *ngIf="serviceFuramaForm.controls.id.hasError('required') && serviceFuramaForm.controls.id.touched">
            *Vui lòng nhập id dịch vụ</span>
          </div>
          <div class="col-6">
            <label class="tilte-input-modal-addNew">Diện tích sử dụng: </label>
            <input type="text" class="form-control input-modal-addNew" formControlName="area">
          </div>
          <div class="col-6">
            <label class="tilte-input-modal-addNew">Tên dịch vụ: </label>
            <input type="text" class="form-control input-modal-addNew" formControlName="name">
          </div>
          <div class="col-6 div-select-modal-addNew">
            <label class="tilte-input-modal-addNew">Loại dịch vụ: </label><br>
            <select class="form-select select-modal-addNew" formControlName="serviceType" [compareWith]="compareWith" >
              <option selected *ngFor="let item of typeServices"
                      [ngValue]="item">{{item.name}}</option>
            </select><br><br>
            <span class="errormessage"
                  *ngIf="serviceFuramaForm.controls.serviceType.hasError('required') && serviceFuramaForm.controls.serviceType.touched">
            *Vui lòng chọn loại dịch vụ</span>
          </div>

          <div class="col-6">
            <label class="tilte-input-modal-addNew">Chi phí thuê: </label>
            <input type="text" class="form-control input-modal-addNew" formControlName="cost">
          </div>
          <div class="col-6 div-select-modal-addNew">
            <label class="tilte-input-modal-addNew"> Kiểu thuê:</label><br>
            <select class="form-select select-modal-addNew " formControlName="rentType">
              <option *ngFor="let item of rentTypes" [ngValue]="item"> {{item.name}}</option>
            </select>
          </div>
          <div class="col-6">
            <label class="tilte-input-modal-addNew">Số lượng người tối đa: </label>
            <input type="text" class="form-control input-modal-addNew" formControlName="peopleMax">
          </div>
          <div class="col-6">
            <label class="tilte-input-modal-addNew">Tiêu chuẩn phòng: </label>
            <input type="text" class="form-control input-modal-addNew" formControlName="standardRoom">
          </div>
          <div class="col-6">
            <label class="tilte-input-modal-addNew">Mô tả tiện nghi khác: </label>
            <input type="text" class="form-control input-modal-addNew" formControlName="descriptionOtherConvenience">
          </div>
          <div class="col-6">
            <label class="tilte-input-modal-addNew">Diện tích hồ bơi: </label>
            <input type="text" class="form-control input-modal-addNew" formControlName="areaPool">
          </div>
          <div class="col-6">
            <label class="tilte-input-modal-addNew">Số tầng: </label>
            <input type="text" class="form-control input-modal-addNew" formControlName="numberOfFloors">
          </div>
          <div class="col-6 div-select-modal-addNew">
            <label class="tilte-input-modal-addNew"> Dịch vụ miến phí đi kèm:</label><br>
            <select class="form-select select-modal-addNew " formControlName="serviceDiv">
              <option selected *ngFor="let item of divTypeServices" [ngValue]="item">{{item.name}}</option>
            </select>
          </div>
          <div class="col-6">
            <label class="tilte-input-modal-addNew">Hình ảnh dịch vụ: </label>
            <input type="file" class="form-control input-modal-addNew">
          </div>
        </div>
      </form>
    </div>
    <div class="modal-footer">
      <button type="button" class="btn btn-secondary" (click)="activeModal.dismiss('cancel')">Cancel</button>
      <button type="submit" class="btn btn-primary" (click)="onSubmit()">Update</button>
    </div>
  `,
})
export class EditServiceModalComponentComponent implements OnInit {
  @Input() id: number;
  service: ServiceFurama;
  serviceFuramaForm: FormGroup;
  @Input() typeServices: ServiceType[];
  @Input() rentTypes: RentType[];
  @Input() divTypeServices: DivService[];

  constructor(public activeModal: NgbActiveModal,
              private fb: FormBuilder,
              private typeService: ServiceTypeServiceService,
              private rentTypeService: RentypeServiceService,
              public divService: ServiceDivServiceService,
              private serviceFurama: ServiceFuramaServiceService) {
  }

  createForm(): void {

  }

  ngOnInit(): void {
    this.service = this.serviceFurama.findById(this.id);
    console.log(this.service);
    this.serviceFuramaForm = this.fb.group({
      id: new FormControl(this.service.id, [Validators.required]),
      name: new FormControl(this.service.name,),
      image: new FormControl(this.service.image,),
      area: new FormControl(this.service.area,),
      cost: new FormControl(this.service.cost,),
      peopleMax: new FormControl(this.service.peopleMax,),
      standardRoom: new FormControl(this.service.standardRoom,),
      descriptionOtherConvenience: new FormControl(this.service.descriptionOtherConvenience,),
      areaPool: new FormControl(this.service.areaPool,),
      numberOfFloors: new FormControl(this.service.numberOfFloors,),
      rentType:[this.service.rentType],
      serviceType: new FormControl(this.service.serviceType, [Validators.required]),
      serviceDiv: new FormControl(this.service.serviceDiv,)
    });
  }

  onSubmit() {
    if (this.serviceFuramaForm.valid) {
      this.serviceFurama.updateProduct(this.serviceFuramaForm.value.id,this.serviceFuramaForm.value);
      this.activeModal.dismiss();
      alert("Cặp nhật thsng công")
    } else {
      alert("Cặp nhật thất bại")
    }

  }
  public compareWith(object1: any, object2: any) {
    return object1 && object2 && object1.label === object2.label;
  }

}
