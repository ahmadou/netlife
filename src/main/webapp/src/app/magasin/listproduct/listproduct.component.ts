import {Component, OnInit, Output, Input, EventEmitter} from '@angular/core';

@Component({
  selector: 'app-listproduct',
  templateUrl: 'listproduct.component.html',
  styleUrls: ['listproduct.component.css']
})
export class ListproductComponent implements OnInit {
  @Input() products;
  @Output() chooseProduct = new EventEmitter();

  constructor() { }

  ngOnInit() {
  }

  public clickProduct(product): void {
    this.chooseProduct.emit(product);
  }

}
