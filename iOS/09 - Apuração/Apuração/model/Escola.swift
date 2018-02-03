//
//  Escola.swift
//  Apuração
//
//  Created by ifpb - lab mac on 31/01/2018.
//  Copyright © 2018 ifpb. All rights reserved.
//

import Foundation

class Escola: NSObject, NSCoding {
    var nome: String!
    var nota: Int!
    
    override var description: String{
        return self.nome
    }
    
    init(nome: String, nota: Int){
        self.nome = nome
        self.nota = nota
    }
    
    required init?(coder aDecoder: NSCoder) {
        self.nome = aDecoder.decodeObject(forKey: "nome") as! String
        self.nota = aDecoder.decodeObject(forKey: "nota") as! Int
    }
    
    func encode(with aCoder: NSCoder) {
        aCoder.encode(self.nome, forKey: "nome")
        aCoder.encode(self.nota, forKey: "nota")
    }
}
