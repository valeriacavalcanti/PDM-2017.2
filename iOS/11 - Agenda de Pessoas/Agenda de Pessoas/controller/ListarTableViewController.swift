//
//  ListarTableViewController.swift
//  Agenda de Pessoas
//
//  Created by ifpb - lab mac on 05/02/2018.
//  Copyright © 2018 ifpb. All rights reserved.
//

import UIKit
import CoreData

class ListarTableViewController: UITableViewController {
    var contexto: NSManagedObjectContext!
    var lista: [NSManagedObject] = []

    override func viewDidLoad() {
        super.viewDidLoad()
        
        let delegate = UIApplication.shared.delegate as! AppDelegate
        self.contexto = delegate.persistentContainer.viewContext

        // Uncomment the following line to preserve selection between presentations
        // self.clearsSelectionOnViewWillAppear = false

        // Uncomment the following line to display an Edit button in the navigation bar for this view controller.
        // self.navigationItem.rightBarButtonItem = self.editButtonItem
    }
    
    override func viewWillAppear(_ animated: Bool) {
        super.viewWillAppear(true)
        self.recuperar()
        self.tableView.reloadData()
    }
    
    func recuperar() {
        let requisicao = NSFetchRequest<NSFetchRequestResult>(entityName: "Pessoa")
        
        do {
            let pessoas = try self.contexto.fetch(requisicao)
            if (pessoas.count > 0){
                self.lista = pessoas as! [NSManagedObject]
            }
        } catch  {
            print("Ixi, deu erro")
        }
    }

  
    // MARK: - Table view data source

    override func tableView(_ tableView: UITableView, didSelectRowAt indexPath: IndexPath) {
        let pessoa = self.lista[indexPath.row]
        let nome = pessoa.value(forKey: "nome")
        let idade = pessoa.value(forKey: "idade") as! Int
        //print("\(nome!) - \(idade)")
        
        let alerta = UIAlertController(title: "Pessoa", message: "\(nome!) - \(idade)", preferredStyle: UIAlertControllerStyle.alert)
        
        let sim = UIAlertAction(title: "Sim", style: UIAlertActionStyle.default) { (void) in
            print("Sim")
        }
        
        let nao = UIAlertAction(title: "Não", style: UIAlertActionStyle.cancel) { (void) in
            print("Não")
        }
        
        alerta.addAction(sim)
        alerta.addAction(nao)
        
        self.present(alerta, animated: true, completion: nil)
    }
    
    override func numberOfSections(in tableView: UITableView) -> Int {
        // #warning Incomplete implementation, return the number of sections
        return 1
    }

    override func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        // #warning Incomplete implementation, return the number of rows
        return self.lista.count
    }


    override func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        let cell = tableView.dequeueReusableCell(withIdentifier: "pessoa", for: indexPath)

        let nome = self.lista[indexPath.row].value(forKey: "nome")
        //let idade = self.lista[indexPath.row].value(forKey: "idade")
        
        cell.textLabel?.text = "\(nome!)"

        return cell
    }



    // Override to support conditional editing of the table view.
    override func tableView(_ tableView: UITableView, canEditRowAt indexPath: IndexPath) -> Bool {
        // Return false if you do not want the specified item to be editable.
        return true
    }



    // Override to support editing the table view.
    override func tableView(_ tableView: UITableView, commit editingStyle: UITableViewCellEditingStyle, forRowAt indexPath: IndexPath) {
        if editingStyle == .delete {
            // Delete the row from the data source
            // remover do banco
            self.contexto.delete(self.lista[indexPath.row])
            self.lista.remove(at: indexPath.row)
            tableView.deleteRows(at: [indexPath], with: .fade)
            
            do{
                try self.contexto.save()
            }catch{
                
            }
        }
    }


    /*
    // Override to support rearranging the table view.
    override func tableView(_ tableView: UITableView, moveRowAt fromIndexPath: IndexPath, to: IndexPath) {

    }
    */

    /*
    // Override to support conditional rearranging of the table view.
    override func tableView(_ tableView: UITableView, canMoveRowAt indexPath: IndexPath) -> Bool {
        // Return false if you do not want the item to be re-orderable.
        return true
    }
    */

    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepare(for segue: UIStoryboardSegue, sender: Any?) {
        // Get the new view controller using segue.destinationViewController.
        // Pass the selected object to the new view controller.
    }
    */

}
