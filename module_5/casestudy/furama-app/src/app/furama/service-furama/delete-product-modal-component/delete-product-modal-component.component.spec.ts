import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DeleteProductModalComponentComponent } from './delete-product-modal-component.component';

describe('DeleteProductModalComponentComponent', () => {
  let component: DeleteProductModalComponentComponent;
  let fixture: ComponentFixture<DeleteProductModalComponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DeleteProductModalComponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DeleteProductModalComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
