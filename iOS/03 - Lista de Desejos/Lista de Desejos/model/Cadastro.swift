//
//  Cadastro.swift
//  Lista de Desejos
//
//  Created by ifpb - lab mac on 18/12/2017.
//  Copyright © 2017 ifpb. All rights reserved.
//

import Foundation

class Cadastro {
    var lista: Array<Desejo>!
    
    init() {
        self.lista = Array<Desejo>()
    }
    
    func add(d:Desejo) {
        self.lista.append(d)
    }
    
    func qtde() -> Int {
        return self.lista.count
    }
}
