//
//  Cadastro.swift
//  Apuração
//
//  Created by ifpb - lab mac on 31/01/2018.
//  Copyright © 2018 ifpb. All rights reserved.
//

import Foundation

class Cadastro: NSObject, NSCoding {
    var lista: Array<Escola>!
    
    override init() {
        self.lista = Array<Escola>()
        
        self.lista.append(Escola(nome: "Primeira", nota: 10))
        self.lista.append(Escola(nome: "Segunda", nota: 9))
        self.lista.append(Escola(nome: "Terceira", nota: 8))
        self.lista.append(Escola(nome: "Quarta", nota: 7))
    }
    
    required init?(coder aDecoder: NSCoder) {
        self.lista = aDecoder.decodeObject(forKey: "lista") as! Array<Escola>
    }
    
    func encode(with aCoder: NSCoder) {
        aCoder.encode(self.lista, forKey: "lista")
    }
    
    func add(escola: Escola) {
        self.lista.append(escola)
    }
    
    func quantidade() -> Int {
        return self.lista.count
    }
    
    func del(index: Int) {
        self.lista.remove(at: index)
    }
}
