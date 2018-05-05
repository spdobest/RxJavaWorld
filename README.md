# Sp-RxJava

#### What is Reactive Programming ?  
Ans : In Reactive Programming, user Reacts to the data or the out come in. This is nothing but the Async Programming or reactive Programming.  
  
RxJava is used for reactive programming. In reactive programming, the consumer reacts to the data as it comes in. Reactive programming allows for event changes to propagate to registered observers.  

**ReactiveX** is a technology or project which integrate Reactive Programm using the combination of Observer Pattern,Functional and Iterator Pattern.**RxJava** is the Java implementation of Reactive Programming. It snothing but user will react on the data we get as output.   
    
#### Main Building Blogs Reactive Programming  
* **Observables** : This is nothing but the data Emitors i.e Observervables is the Sourse of data which emit data when **Suscriber** Start listening. Observervables will terminate either by emitting Data Successfully or terminate by showing an Error. Observervables never terminate operation without doing ANything. If we click one Button, it will show Output data successfully or it will show Error.  
* **Subscribers (or observers)** : An Observervable have many number of suscribers. If any data change in the Observable, it will react in the **onNext, onCOmplete or OnError methods**.if the observable finishes its data flow with an error, the onError() method is called on each subscriber.  
  
#### What is the need of Reactive Programming ?  
Ans : Reactive Programming is nothing but the Asyncronous Programming. Independent of other task.

Observeable.from(donnNetworkOperation()).
SuscribeOn(Scheduler.io).


RX = OBSERVABLE + OBSERVER + SCHEDULERS  
  
**So at a very high level, RxJava is all about:**    
  
Creating an Observable.  
Giving that Observable some data to emit.  
Creating an Observer.  
Assigning the Observer to an Observable.  
Giving the Observer tasks to perform whenever it receives an emission from its assigned Observable.  
  
##### Rx Java methods used   

**1. Observable.just()**  
You can use the .just() operator to convert any object into an Observable. The result Observable will then emit the original object and complete.  
  
For example, here we're creating an Observable that'll emit a single string to all its Observers:  
Observable<String> observable = Observable.just("Hello World!");  
    
**2. Observable.from()**  
  
The .from() operator allows you to convert a collection of objects into an observable stream. You can convert an array into an Observable using Observable.fromArray, a Callable into an Observable using Observable.fromCallable, and an Iterable into an Observable using Observable.fromIterable.

**3. Observable.range()**  
  
You can use the .range() operator to emit a range of sequential integers. The first integer you provide is the initial value, and the second is the number of integers you want to emit. For example:
  
Observable<Integer> observable = Observable.range(0, 5); 
    
**4.Observable.interval()**  
  
This operator creates an Observable that emits an infinite sequence of ascending integers, with each emission separated by a time interval chosen by you. For example:  
  
Observable<Long> observable = Observable.interval(1, TimeUnit.SECONDS)  
  
**5. Observable.empty()**  
  
The empty() operator creates an Observable that emits no items but terminates normally, which can be useful when you need to quickly create an Observable for testing purposes.   
  
Observable<String> observable = Observable.empty();  
      
#### RxJava 2 Examples present in this sample project  
  
1. RxJava 2.0 Example using CompositeDisposable as CompositeSubscription and Subscription have been removed.  
  
2. RxJava 2 Example using Flowable.  
  
3. RxJava 2 Example using SingleObserver, CompletableObserver.  
  
4. RxJava 2 Example using RxJava2 operators such as map, zip, take, reduce, flatMap, filter, buffer, skip, merge, concat, replay, and much more:  
  
RxJava 2 Android Samples using Function as Func1 has been removed.  
  
RxJava 2 Android Samples using BiFunction as Func2 has been removed.  
  
And many others android examples  
  
Quick Look on few changes done in RxJava2 over RxJava1  
  
**RxJava1 -> RxJava2**   
    
onCompleted -> onComplete - without the trailing d  
Func1 -> Function  
Func2 -> BiFunction  
CompositeSubscription -> CompositeDisposable  
limit operator has been removed - Use take in RxJava2  
and much more.  

**Operators :**  
  
**Map** -> transform the items emitted by an Observable by applying a function to each item  
**Zip** -> combine the emissions of multiple Observables together via a specified function and emit single items for each combination based on the results of this function  
**Filter** -> emit only those items from an Observable that pass a predicate test  
**FlatMap** -> transform the items emitted by an Observable into Observables, then flatten the emissions from those into a single Observable  
**Take** -> emit only the first n items emitted by an Observable  
**Reduce** -> apply a function to each item emitted by an Observable, sequentially, and emit the final value  
**Skip** -> suppress the first n items emitted by an Observable  
**Buffer** -> periodically gather items emitted by an Observable into bundles and emit these bundles rather than emitting the items one at a time  
**Concat** -> emit the emissions from two or more Observables without interleaving them  
**Replay** -> ensure that all observers see the same sequence of emitted items, even if they subscribe after the Observable has begun emitting items  
**Merge** -> combine multiple Observables into one by merging their emissions  
**SwitchMap** -> ransform the items emitted by an Observable into Observables, and mirror those items emitted by the most-recently transformed Observable   
  
    
  https://techbeacon.com/missing-rxjava-2-guide-supercharge-your-android-development  
  
    
 **EXAMPLES**  
   
   
  
