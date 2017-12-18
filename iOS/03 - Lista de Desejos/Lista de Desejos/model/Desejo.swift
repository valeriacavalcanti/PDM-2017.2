//
//  Desejo.swift
//  Lista de Desejos
//
//  Created by ifpb - lab mac on 18/12/2017.
//  Copyright © 2017 ifpb. All rights reserved.
//

import Foundation

class Desejo: NSObject {
    var descricao: String!
    var valor: Float!
    
    override var description: String{
        return "\(descricao) - \(valor)"
    }
    
    init(descricao: String, valor: Float) {
        self.descricao = descricao
        self.valor = valor
    }
}
