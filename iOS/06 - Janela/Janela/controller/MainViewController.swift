//
//  ViewController.swift
//  Janela
//
//  Created by ifpb - lab mac on 24/01/2018.
//  Copyright © 2018 ifpb. All rights reserved.
//

import UIKit

class MainViewController: UIViewController {
   
    @IBOutlet weak var lbQuantidade: UILabel!
    var cadastro = Cadastro()
    
    // executado sempre que a tela for ser apresentada
    override func viewWillAppear(_ animated: Bool) {
        super.viewWillAppear(true)
        self.lbQuantidade.text = String(self.cadastro.quantidade())
    }

    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        if (segue.identifier == "main_form"){
            let fvc = segue.destination as! FormViewController
            fvc.cadastro = self.cadastro
        }
    }
    
}

