package com.company;

import javax.swing.*;

public class Lista {


     private Node head=null;

     //todo add


    public void addStart(Masina m){

        if(head==null){
            head= new Node(m,null);

        }else{
            Node node= new Node(m,head);

            head=node;

        }
    }


    //todo addSfarsit

  public void addSfarsit(Masina m){

      if(head==null){
          head= new Node(m,null);

      }else{

          Node aux=head;
          while (aux.getNext()!=null){

               aux=aux.getNext();
          }

          Node nou = new Node(m,null);

          aux.setNext(nou);

      }


  }

    //todo traverse
    public void afisare(){

        Node aux=head;
        while(aux!=null ){

            System.out.println(aux.getData());

            aux=aux.getNext();
        }
    }

    //todo: contains

    public boolean contains(Masina masina){
        Node aux=head;
        while (aux!=null){
            if(aux.getData().equals(masina)){
                return true;
            }
        }return false;

    }

    //todo : is empty

    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        else {
            return false;
        }
    }
    //todo : size
    public int size(){
        Node aux=head;
        int cont=0;
        while (aux!=null){
            cont++;
            }
        return cont;

    }


}
