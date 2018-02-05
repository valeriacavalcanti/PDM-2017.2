//
//  ViewController.swift
//  Agenda de Pessoas
//
//  Created by ifpb - lab mac on 05/02/2018.
//  Copyright © 2018 ifpb. All rights reserved.
//

import UIKit
import CoreData

class ViewController: UIViewController {
    var contexto: NSManagedObjectContext!

    @IBOutlet weak var tfNome: UITextField!
    @IBOutlet weak var tfIdade: UITextField!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        let delegate = UIApplication.shared.delegate as! AppDelegate
        self.contexto = delegate.persistentContainer.viewContext
    }
    
    
    @IBAction func salvar(_ sender: Any) {
        // instanciar uma pessoa
        let pessoa = NSEntityDescription.insertNewObject(forEntityName: "Pessoa", into: self.contexto)
        
        // preencher os dados de uma pessoa
        pessoa.setValue(self.tfNome.text, forKey: "nome")
        pessoa.setValue(Int(self.tfIdade.text!), forKey: "idade")
        
        // persistir essa pessoa no contexto
        do {
            try self.contexto.save()
            self.limpar()
            print("sucesso")
        } catch  {
            print("deu erro")
        }
        
        self.listar()
        self.navigationController?.popViewController(animated: true)
    }
    
    func limpar() {
        self.tfNome.text = ""
        self.tfIdade.text = ""
        self.tfNome.becomeFirstResponder()
    }
    
    func listar() {
        let requisicao = NSFetchRequest<NSFetchRequestResult>(entityName: "Pessoa")
        
        do {
            let pessoas = try self.contexto.fetch(requisicao)
            if (pessoas.count > 0){
                for pessoa in pessoas as! [NSManagedObject]{
                    let nome = pessoa.value(forKey: "nome") as! String
                    let idade = pessoa.value(forKey: "idade") as! Int
                    print("\(nome) - \(idade)")
                }
            }
        } catch  {
            print("Ixi, deu erro")
        }
    }
}

