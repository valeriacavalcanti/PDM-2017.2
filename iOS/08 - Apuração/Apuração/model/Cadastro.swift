//
//  Cadastro.swift
//  Apuração
//
//  Created by ifpb - lab mac on 31/01/2018.
//  Copyright © 2018 ifpb. All rights reserved.
//

import Foundation

class Cadastro {
    var lista: Array<Escola>!
    
    init() {
        self.lista = Array<Escola>()
    }
    
    func add(escola: Escola) {
        self.lista.append(escola)
    }
    
    func quantidade() -> Int {
        return self.lista.count
    }
}
