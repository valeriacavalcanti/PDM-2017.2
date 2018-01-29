//
//  Cadastro.swift
//  Carnaval
//
//  Created by ifpb - lab mac on 29/01/2018.
//  Copyright © 2018 ifpb. All rights reserved.
//

import Foundation

class Cadastro{
    var lista: Array<Bloco>!
    
    init() {
        self.lista = Array<Bloco>()
    }
    
    func add(b: Bloco) {
        self.lista.append(b)
    }
    
    func quantidade() -> Int {
        return self.lista.count
    }
}
