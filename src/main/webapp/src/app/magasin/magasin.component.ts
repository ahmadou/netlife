import { Component, OnInit } from '@angular/core';
import {MagasinService} from "./magasin.service";

@Component({
  selector: 'app-magasin',
  templateUrl: './magasin.component.html',
  styleUrls: ['./magasin.component.css']
})
export class MagasinComponent implements OnInit {
  private _onglet: string = "list";
  private _children;
  private _products = [];
  private _panier = [];

  constructor(private _magasinService: MagasinService) {
    this._magasinService.getChildren()
      .then(response => this._children = Object.assign(response.json()))
      .catch(error => console.log(error));

    this._magasinService.getProducts()
      .then(response => this._products = response.json())
      .catch(error => console.log(error));
  }

  ngOnInit() {

  }

  public changeOnglet(onglet: string): void {
    this._onglet = onglet;
  }

  public addPanier(product): void {
    this._panier.push(product);
  }

}
