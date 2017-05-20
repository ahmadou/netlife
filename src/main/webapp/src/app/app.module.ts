import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { DocteurComponent } from './docteur/docteur.component';
import { MagasinComponent } from './magasin/magasin.component';
import { PerduComponent } from './perdu/perdu.component';
import {Routes, RouterModule} from "@angular/router";
import { HomeComponent } from './home/home.component';
import {DocteurService} from "./docteur/docteur.service";
import {MagasinService} from "./magasin/magasin.service";
import {PerduService} from "./perdu/perdu.service";
import { PanierComponent } from './magasin/panier/panier.component';
import {ListproductComponent} from "./magasin/listproduct/listproduct.component";

const appRoutes: Routes = [
  { path: 'docteur', component: DocteurComponent },
  { path: 'magasin', component: MagasinComponent },
  { path: 'perdu', component: PerduComponent },
  { path: '**', component: HomeComponent }
];

@NgModule({
  declarations: [
    AppComponent,
    DocteurComponent,
    MagasinComponent,
    PerduComponent,
    HomeComponent,
    ListproductComponent,
    PanierComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RouterModule.forRoot(appRoutes),
  ],
  providers: [
    DocteurService,
    MagasinService,
    PerduService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
