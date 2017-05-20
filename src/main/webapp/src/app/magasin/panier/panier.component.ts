import {Component, OnInit, Input} from '@angular/core';

@Component({
  selector: 'app-panier',
  templateUrl: 'panier.component.html',
  styleUrls: ['panier.component.css']
})
export class PanierComponent implements OnInit {
  @Input() children;
  @Input() panier;

  constructor() { }

  ngOnInit() {
  }

  public totalPrix(): number {
    var prix = 0.0;
    for(var product of this.panier){
      prix = prix+product.prix;
    }
    return prix;
  }

  public isAllergique(product): boolean {
    var toReturn = false;
    for(var composant of this.children.nutrition.allergies){
      if(product.composant === composant){
        toReturn = true;
      }
    }
    return toReturn;
  }

}
