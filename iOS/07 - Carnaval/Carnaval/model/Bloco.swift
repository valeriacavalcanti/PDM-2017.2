//
//  Bloco.swift
//  Carnaval
//
//  Created by ifpb - lab mac on 29/01/2018.
//  Copyright © 2018 ifpb. All rights reserved.
//

import Foundation

class Bloco: NSObject {
    var nome: String!
    var valor: Float!
    
    override var description: String{
        return self.nome
    }
    
    init(nome:String, valor: Float) {
        self.nome = nome
        self.valor = valor
    }
}
