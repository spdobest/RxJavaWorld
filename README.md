# Sp-RxJava

#### What is Reactive Programming ?  
Ans : In Reactive Programming, user Reacts to the data or the out come in. This is nothing but the Async Programming or reactive Programming.  

**ReactiveX** is a technology or project which integrate Reactive Programm using the combination of Observer Pattern,Functional and Iterator Pattern.**RxJava** is the Java implementation of Reactive Programming. It snothing but user will react on the data we get as output.   
    
#### Main Building Blogs Reactive Programming  
* **Observables** : This is nothing but the data Emitors i.e Observervables is the Sourse of data which emit data when **Suscriber** Start listening. Observervables will terminate either by emitting Data Successfully or terminate by showing an Error. Observervables never terminate operation without doing ANything. If we click one Button, it will show Output data successfully or it will show Error.  
* **Subscribers (or observers)** : An Observervable have many number of suscribers. If any data change in the Observable, it will react in the **onNext, onCOmplete or OnError methods**.if the observable finishes its data flow with an error, the onError() method is called on each subscriber.  
  
#### What is the need of Reactive Programming ?  
Ans : Reactive Programming is nothing but the Asyncronous Programming. Independent of other task.

