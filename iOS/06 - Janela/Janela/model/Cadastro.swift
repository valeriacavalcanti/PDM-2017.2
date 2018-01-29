//
//  Cadastro.swift
//  Janela
//
//  Created by ifpb - lab mac on 24/01/2018.
//  Copyright © 2018 ifpb. All rights reserved.
//

import Foundation

class Cadastro {
    var lista: Array<String>!
    
    init() {
        self.lista = Array<String>()
    }
    
    func add(palavra: String) {
        self.lista.append(palavra)
    }
    
    func quantidade() -> Int {
        return self.lista.count
    }
}
