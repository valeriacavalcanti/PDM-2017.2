//
//  ViewController.swift
//  Lista de Desejos
//
//  Created by ifpb - lab mac on 18/12/2017.
//  Copyright © 2017 ifpb. All rights reserved.
//

import UIKit

class MainViewController: UIViewController {
    @IBOutlet weak var tfDescricao: UITextField!
    @IBOutlet weak var tfValor: UITextField!
    @IBOutlet weak var lbQuantidade: UILabel!
    
    var cadastro = Cadastro()
    
    @IBAction func cadastrar(_ sender: Any) {
        let desc = self.tfDescricao.text
        let valor = Float(self.tfValor.text!)
        
        let desejo = Desejo(descricao: desc!, valor: valor!)
        self.cadastro.add(d: desejo)
        
        self.lbQuantidade.text = String(self.cadastro.qtde())
    }
    
}

