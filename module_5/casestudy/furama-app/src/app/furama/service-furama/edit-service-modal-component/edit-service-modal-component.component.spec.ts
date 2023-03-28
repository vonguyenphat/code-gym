import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EditServiceModalComponentComponent } from './edit-service-modal-component.component';

describe('EditServiceModalComponentComponent', () => {
  let component: EditServiceModalComponentComponent;
  let fixture: ComponentFixture<EditServiceModalComponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EditServiceModalComponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EditServiceModalComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
