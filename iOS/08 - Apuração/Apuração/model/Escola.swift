//
//  Escola.swift
//  Apuração
//
//  Created by ifpb - lab mac on 31/01/2018.
//  Copyright © 2018 ifpb. All rights reserved.
//

import Foundation

class Escola: NSObject {
    var nome: String!
    var nota: Int!
    
    override var description: String{
        return self.nome
    }
    
    init(nome: String, nota: Int){
        self.nome = nome
        self.nota = nota
    }
}
