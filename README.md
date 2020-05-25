# RxJava Fundamentals and Concept

## Important Links
- https://github.com/ReactiveX/RxJava/wiki/Alphabetical-List-of-Observable-Operators      
- https://proandroiddev.com/exploring-rxjava-in-android-e52ed7ef32e2
- https://www.androidhive.info/RxJava/android-getting-started-with-reactive-programming/   
- https://www.androidhive.info/RxJava/tutorials/  

## What are the changes in RxJava3 as Compared to RxJava2
- https://github.com/ReactiveX/RxJava/wiki/What's-different-in-3.0    
   
 ### DATA STREAMS EVERYWHERE  
• If you consider a mobile application, you can create a data stream out of anything  
• Click events, network calls, data storage, variable changes and even errors can be used to generate data streams  
• Modules run on their own threads, executing multiple code blocks at the same time.    
   
#### What is Reactive Programming ?  
- In Reactive Programming, user Reacts to the data or the output comes in. This is nothing but the Async Programming or reactive Programming.
- Reactive Programming is a programming paradigm oriented around data flows and the propagation of change i.e. it is all about responding to value changes. For example, let’s say we define x = y+z. When we change the value of y or z, the value of x automatically changes. This can be done by observing the values of y and z.  
- Reactive Extensions is a library that follows Reactive Programming principles to compose asynchronous and event-based programs by using observable sequence.  
- In reactive programming the consumer code blocks reacts to the data as it comes in.  
- RxJava is used for reactive programming. In reactive programming, the consumer reacts to the data as it comes in. Reactive programming allows for event changes to propagate to registered observers.  
  
**ReactiveX** is a technology or project which integrate Reactive Program using the combination of Observer Pattern,Functional and Iterator Pattern.  
**RxJava** is the Java implementation of Reactive Programming. It's nothing but user will react on the data we get as output.  
  
**ReactiveX is a short word for reactive extensions.**  
• ReactiveX is a project which provides implementations for this reactive programming concept for different programming languages.  
• ReactiveX is a combination of the best ideas from the Observer pattern, the Iterator pattern, and functional programming.        
## What is the difference between RxJava and RxAndroid?        
- RxAndroid does not replace rxjava.  
- RxAndroid is just a layer on top of RxJava which provides android specific support.           
  
## Why and When should we use RxJava ?  What are the benefits?
- Interfaces and methods provided by Reactive Extensions (Rx) provide a way to developers solve problems rapidly. We can save a lot of time we usually spend for writing complex algorithms and bug fixing.  
- As it provides a common structure we can write easy to understand and easy to maintain code. RxJava support us to write clean and simpler code.  
- RxJava allow a different approach of programming than imperative(way we usually code in Android) approach. It is reactive based, where codes are not activate until it knows it’s end mean.  
- RxJava makes multi-threading super easy. Using imperative approach, moving a piece of code to background thread is hard work. However in RxJava, we could easily define what thread each part of the chain would be in.  
- It provide extensibility to our code. RxJava code can be extended with custom operators. 
- **RxJava** is composable, Rx operators can be combined to produce more complicated operations.  
- **Rx operators** can transform one type of data to another, reducing, mapping or expanding streams as needed.  
- UI events like mouse move , button click, domain events like property changed, collection updated can be easily use to generate and handle data streams with RxJava.  
- Error handling becomes much easier with RxJava. You don’t need to worry about adding try catch blocks everywhere.  
- In mobile applications, we cannot control the app lifecycle. Sometimes we need to terminate current processes rapidly to response to a app lifecycle change. RxJava provide simple yet profound mechanism to terminate background processes rapidly.  
- Particularly, callBack occurs when performing several asynchronous operations in a series where the next action depends on the results of the previous operation, making the code untidy and hard to manage. RxJava renders a better way to terminate the urgency to build layers of callbacks.  
- The RxJava library was designed to give a control over a wide range of data, simultaneously on the events in the real-time. This allows us to build highly responsive mobile applications.  
- Some people say Ios apps has better performance than Android apps. That's not true if we use RxJava. we can provide same or even better performance to native Android applications with RxJava.  
  
**KEY POINTS**  
* Reactive programming is a specification for dealing with asynchronous streams of data  
* Reactive provides tools for transforming and combining streams and for managing flow-control  
* Marble diagrams provide an interactive canvas for visualizing reactive constructs  
* Resembles Java Streams API but the resemblance is purely superficial  
* Attach to hot streams to attenuate and process asynchronous data feeds  
    
## Main Building Blogs Reactive Programming  
### Observables
    - This is nothing but the data Emitors.   
    - Instances of Observable class.  
    - Observables observe data streams and emit them to subscribed Observers.   
    - Rx Java provides 5 base classes to create observable classes.
      
### Observer or Subscriber
    - It is the listener of the data change in **Observable**.
    - One **Observable** can have any number of **Observer Or Subscriber**.
    - If the observable finishes its data flow successful, the onComplete() method is called on each subscriber. 
    - Similar, if the observable finishes its data flow with an error, the onError() method is called on each subscriber.
    - Start listening. 
    - Observervables will terminate either by emitting Data Successfully or terminate by showing an Error. 
    - Observervables never terminate operation without doing Anything. 
    - If we click one Button, it will show Output data successfully or it will show Error.  
  
### Subject
    - A Subject is a sort of bridge or proxy that is available in some implementations of ReactiveX that acts both as an observer and as an Observable 
    - Because it is an observer, it can subscribe to one or more Observables, and because it is an Observable, it can pass through the items it observes by reemitting them, and it can also emit new items.
    - Because a Subject subscribes to an Observable, it will trigger that Observable to begin emitting items (if that Observable is “cold” — that is, if it waits for a subscription before it begins to emit items). 
    - This can have the effect of making the resulting Subject a “hot” Observable variant of the original “cold” Observable.
    - **There are 4 veriety of Subjects.**
        - **AsyncSubject** - An AsyncSubject emits the last value (and only the last value) emitted by the source Observable, and only after that source Observable completes.
        - **BehaviorSubject** - When an observer subscribes to a BehaviorSubject, it begins by emitting the item most recently emitted by the source Observable (or a seed/default value if none has yet been emitted) and then continues to emit any other items emitted later by the source Observable(s).
        - **PublishSubject** -  emits to an observer only those items that are emitted by the source Observable(s) subsequent to the time of the subscription.
        - **ReplaySubject** - emits to any observer all of the items that were emitted by the source Observable(s), regardless of when the observer subscribes.
        
  
### Operator 
- RxJava Operators allows you manipulate the data emitted by Observables. 
- Basically, operators tells Observable, how to modify the data and when to emit the data. 
- Using the operators you can modify, merge, filter or group the data streams. ... 
- You can achieve any complex data stream by combining multiple operators together.
- Now that we have implemented a basic Observable with an Observer, we can take a look at the different operators in RxJava. - - Operators allow you to manipulate the data that was emitted or create new Observables.
        
## What is the need of Reactive Programming ?  
- Reactive Programming is nothing but the Asyncronous Programming. Independent of other task.
- ```
      Observeable.from(doNetworkOperation()).
      SuscribeOn(Scheduler.io).
  ```
  
**RX = OBSERVABLE + OBSERVER + SCHEDULERS**  
  
## So at a very high level, RxJava is all about   
- Creating an Observable.  
- Giving that Observable some data to emit.  
- Creating an Observer.  
- Assigning the Observer to an Observable.  
- Giving the Observer tasks to perform whenever it receives an emission from its assigned Observable.  
  
## Instances of observer interface
- Observers consume data emitted by the Observables.     
- One Observable can have many observers. An observable emit data, if there is at least one observer subscribed for the data. - If there is no subscription observable will not emit data.  
- Main observer methods(there are other methods too)  

## Operators for creating Observables  
    
**onNext()** :- Each time an Observable emits data it  calls to Observer's  onNext() method  passing that data.  
  
**onError()** :- If any error occur Observable calls to Observer's onError() method.  
  
**onComplete()** :- Observable invokes Observer's onComplete() method, when the data emission is over.  
    
* **Observer (or Subscribers in version 1)** : Instance of Observer Interface, they consume data emitted byt the observables.An Observable have many number of **Observer's**. If any data change in the Observable, it will react in the **onNext, onCOmplete or OnError methods**.if the observable finishes its data flow with an error, the onError() method is called on each Observer.  
  
Observable emit data if at lest one observer is subscribed for data, if no Observer is subscribed , then Observable will not emit data.  
  
## Disposable 
- How memory leaks happen, most of the time ?  
- In mobile applications we cannot control the app life-cycle. Let’s say in an app you created you have written code to run a network call to a REST API and update the view accordingly. If a user initiate a view but decide to go back before the completion of the network call, What will happen? The activity or fragment will be destroyed. But the observer subscription will be there. When observer trying to update the User Interface, in this scenario as the view already destroyed,  it can cause a memory leak. And your app will freeze or crash as a result.  
- This is what we can simply do (If only one observer there)  
  
### Steps to Implement Disposable 
- 1. Declare a Disposable.  
      ```      
        private Disposable disposable;  
        ```
- 2. Observer's onSubscribe method has a parameter of type Disposable.Observer invokes this method passing a disposable value which we can use to terminate the subscription.  From there we can assign value to the Disposable we declared.  
- 3. Override the onDestroy method of your activity or fragment. (code->override methods)  
- 4.This method will always be invoked when the activity or fragment destroyed.(when user move to another view).   
      - So we can add code to dispose the disposable there.In the onDestroy method just write
      - ```
            disposable.dispose();
        ``` 
          
## What are Disposable Observers ?
- DisposableObserver class implements both Observer and Disposable interfaces. DisposableObserver is much efficient than Observer if you have more than one observers in the activity or fragment.  
- Observer implementation had four overridden methods. onSubscribe() method was mainly there to receive the disposable.  
- In the onDestroy() method activity , you can write, disposableObserver.dispose().  
  
## Schedulers
- To perform operations of Observable on different threads(multi-threading).
- Between Observer and observable there is scheduler. 
- It is used to handle multithreading. 
- It decides whether the code will run in background thread or main thread. 
- There are mainly 2 Schedulers used in Rx Java, 
  - 1. Schedulers.io  
  - 2. AbdroidSchedulers.mainThread()  
  
## Scheduler.io() 
- Can have limitless threadpool.   
- can have non CPU intesive task  
- For Task related to database operation, network communication and file system interaction.  
- This is used to perform non CPU-intensive operations like making network calls, reading disc / files, database operations etc., This maintains pool of threads.  
   
## Scheduler.newThread()    
- This scheduler creates a new thread for each unit of work scheduled.
- Using this, a new thread will be created each time a task is scheduled. 
- It’s usually suggested not to use schedular unless there is a very long running operation. 
- The threads created via newThread() won’t be reused.    
   
## AndroidSchedulers.mainThread()
– This provides access to android Main Thread / UI Thread. 
- Usually operations like updating UI, user interactions happens on this thread. 
- We shouldn’t perform any intensive operations on this thread as it makes the app glitchy or ANR dialog can be thrown.  
    
## Scheduler.single() 
This scheduler has a single thread execution tasks one after another following the given order.  
  
## Schedulers.immediate() 
- This scheduler will execute all the tasks in sequential order they are added. 
- This can be used when there is necessity of sequential execution is required.
- This scheduler executes the the task immediately in synchronous way by blocking the main thread.  

## Schedulers.computation()
– This schedular can be used to perform CPU-intensive operations like processing huge data, bitmap processing etc., 
- The number of threads created using this scheduler completely depends on number CPU cores available.  
  
## Scheduler.trampoline()      
- It executes the tasks in First In – First Out manner. 
- All the scheduled tasks will be executed one by one by limiting the number of background threads to one.
- This scheduler executes tasks following first in first out basics.  
  
## Scheduler.from(Executor executor)**  
- This allows us to create a scheduler from an executor by limiting number of threads to be created. 
- When thread pool is occupied, tasks will be queued.
- This creates and returns costume scheduler backed by a specific executor.  

**NOTE : **Even through there are lot of Schedulers available, **Schedulers.io()** and **AndroidSchedulers.mainThread()** are extensively used in android programming. Below are the list of schedulers available and their brief introduction.
   
## Operators 
- To modify data  
- Its is used to convert the data streams before it recieved by the observers. They allow to change by different operators. **There are around 70 operators**    
  
- **Observable — Operator — Observer**
- An Observable is like speaker which emit value. It does some work and emits some values.
- An Operator is like translator which translate/modify a data from one form to another form.
- An Observer gets those values.

## 1. Observable 
## 2. Flowable
- Flowable comes to picture when there is a case that the Observable is emitting huge numbers of values which can’t be consumed by the Observer.  
- In this case, the Observable needs to skip some values on the basis of some strategy else it will throw an exception.    
- The Flowable Observable handles the exception with a strategy.
- The strategy is called BackPressureStrategy and the exception is called MissingBackPressureException.  
- **Creating a Flowable Observable**   
    - Similar to normal Observable, you can create Flowable using Flowable.create().  
    - Observer for Flowable Observable  
    - The Observer for Flowable is exactly same as normal Observer.  
  
## 3. Single 
- Single is used when the Observable has to emit only one value like a response from a network call.  
- How to create Single Observable  
- ```
      new SingleObserver<String>() {  
            @Override  
            public void onSubscribe(Disposable d) {  
                Log.d(TAG, " onSubscribe : " + d.isDisposed());  
            }  
  
            @Override  
            public void onSuccess(String value) {  
                textView.append(" onNext : value : " + value);  
                textView.append(AppConstant.LINE_SEPARATOR);  
                Log.d(TAG, " onNext value : " + value);  
            }  
  
            @Override  
            public void onError(Throwable e) {  
                textView.append(" onError : " + e.getMessage());  
                textView.append(AppConstant.LINE_SEPARATOR);  
                Log.d(TAG, " onError : " + e.getMessage());  
            }  
        };  
  ```              
## 4. Maybe 
- Maybe is used when the Observable has to emit a value or no value.  
## 5. Completable 
- Completable is used when the Observable has to do some task without emitting a value.  
- How to create Completable Observable class   
- ```
  new CompletableObserver() {  
            @Override  
            public void onSubscribe(Disposable d) {  
                Log.d(TAG, " onSubscribe : " + d.isDisposed());   
            }  
  
            @Override  
            public void onComplete() {  
                textView.append(" onComplete");   
                textView.append(AppConstant.LINE_SEPARATOR);  
                Log.d(TAG, " onComplete");  
            }  
  
            @Override   
            public void onError(Throwable e) {  
                textView.append(" onError : " + e.getMessage());  
                textView.append(AppConstant.LINE_SEPARATOR);  
                Log.d(TAG, " onError : " + e.getMessage());  
            }  
        }; 
     ```   
## following are the different types of Observers in RxJava  
- Observer
- SingleObserver
- MaybeObserver
- CompletableObserver

## SingleObserver Example 
/*  
     * simple example using SingleObserver  
     */  
    private void doSomeWork() {  
        Single.just("Amit")  
                .subscribe(getSingleObserver());  
    }  
  
    private SingleObserver<String> getSingleObserver() {  
        return new SingleObserver<String>() {  
            @Override  
            public void onSubscribe(Disposable d) {  
                Log.d(TAG, " onSubscribe : " + d.isDisposed());  
            }  
  
            @Override  
            public void onSuccess(String value) {  
                textView.append(" onNext : value : " + value);  
                textView.append(AppConstant.LINE_SEPARATOR);  
                Log.d(TAG, " onNext value : " + value);  
            }  
  
            @Override   
            public void onError(Throwable e) {    
                textView.append(" onError : " + e.getMessage());  
                textView.append(AppConstant.LINE_SEPARATOR);  
                Log.d(TAG, " onError : " + e.getMessage());  
            }  
        };  
    }  
  
* **Disposable** : It is an interface having two methods **dispose() and isDisposed()**  
  
public interface Disposable {  
  void dispose();  
  boolean isDisposed();  
}    

## Composite Disposable 
In one class you can have more than one observers . So you will have so many observers to dispose.  
  
We can dispose them one by one like this.  
  
 @Override  
    protected void onDestroy() {  
        super.onDestroy();  
        observer1.dispose();  
        observer2.dispose();  
    }    
  
This is not the best way to do this , specially if you have many observers.  
When we have more than one observers we use CompositeDisposable .  
  
private CompositeDisposable compositeDisposable = new CompositeDisposable();  
     
Then we can add each Observer to CompositeDisposable  
compositeDisposable.add(myObserver1);  
  
CompositeDisposable Can maintain a list of subscriptions in a pool and can dispose them all at once.  
@Override  
    protected void onDestroy() {  
        super.onDestroy();  
        compositeDisposable.dispose();  
    }    
We can also call to clear method to get the same work done.  
@Override  
    protected void onDestroy() {  
        super.onDestroy();  
        compositeDisposable.clear();  
    }    
   
**What is the difference between clear() and dispose() ?**  
When you are using CompositeDisposable, If you call to dispose() method, you will no longer be able to add disposables to that composite disposable.  
  
But if you call to clear() method you can still add disposable to the composite disposable . Clear() method just clears the disposables that are currently held within the instance.    
  
### Types of Observables ##  
  
**Alphabetical List of Observable Operators**  
https://github.com/ReactiveX/RxJava/wiki/Alphabetical-List-of-Observable-Operators  



**1. Observable.just()**  
You can use the .just() operator to convert any object into an Observable. The result Observable will then emit the original object and complete.  
  
http://reactivex.io/documentation/operators/just.html  
  
For example, here we're creating an Observable that'll emit a single string to all its Observers:  
Observable<String> observable = Observable.just("Hello World!");  
    
**2. Observable.from()**  
  
The .from() operator allows you to convert a collection of objects into an observable stream. You can convert an array into an Observable using Observable.fromArray, a Callable into an Observable using Observable.fromCallable, and an Iterable into an Observable using Observable.fromIterable.  
  
http://reactivex.io/documentation/operators/from.html  
  
**3. Observable.range()**  
  
You can use the .range() operator to emit a range of sequential integers. The first integer you provide is the initial value, and the second is the number of integers you want to emit. For example:
  
Observable<Integer> observable = Observable.range(0, 5); 
  
http://reactivex.io/documentation/operators/range.html     
    
**4.Observable.interval()**  
  
This operator creates an Observable that emits an infinite sequence of ascending integers, with each emission separated by a time interval chosen by you. For example:  
  
Observable<Long> observable = Observable.interval(1, TimeUnit.SECONDS)  
  
**5. Observable.empty()**  
  
The empty() operator creates an Observable that emits no items but terminates normally, which can be useful when you need to quickly create an Observable for testing purposes.   
  
Observable<String> observable = Observable.empty();  
  
**Observable.just()** — Creates an observable around any data type and emits the given item.  
  
**Observable.fromArray()** — Creates an observable that emits all the items of the given array one by one.  
  
**Observable.interval()** — Creates an observable that emits a sequence of integers in a given interval of time.  
  
**Observable.empty()** — Creates an observable that emits nothing and completes successfully.  
  
**Observable.error()** — Creates an observable that emits nothing and throws an error.  


**Operators :**  
  
**Map** -> transform the items emitted by an Observable by applying a function to each item  
  
  http://reactivex.io/documentation/operators/map.html  
  
**Zip** -> combine the emissions of multiple Observables together via a specified function and emit single items for each combination based on the results of this function  
**Filter** -> emit only those items from an Observable that pass a predicate test  
**FlatMap** -> transform the items emitted by an Observable into Observables, then flatten the emissions from those into a single Observable  
  
  http://reactivex.io/documentation/operators/flatmap.html  
  
**Take** -> emit only the first n items emitted by an Observable  
**Reduce** -> apply a function to each item emitted by an Observable, sequentially, and emit the final value  
**Skip** -> suppress the first n items emitted by an Observable  
  
http://reactivex.io/documentation/operators/skip.html  
  
**SkipLast**  
  
http://reactivex.io/documentation/operators/skiplast.html  
    
**Buffer** -> periodically gather items emitted by an Observable into bundles and emit these bundles rather than emitting the items one at a time  
  
  http://reactivex.io/documentation/operators/buffer.html  
  
**Concat** -> emit the emissions from two or more Observables without interleaving them  
  
http://reactivex.io/documentation/operators/concat.html    
  
**Replay** -> ensure that all observers see the same sequence of emitted items, even if they subscribe after the Observable has begun emitting items  
**Merge** -> combine multiple Observables into one by merging their emissions  
**SwitchMap** -> ransform the items emitted by an Observable into Observables, and mirror those items emitted by the most-recently transformed Observable  
      
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
 
  https://techbeacon.com/missing-rxjava-2-guide-supercharge-your-android-development  
    
**Github Examples**  
https://github.com/amitshekhariitbhu/RxJava2-Android-Samples  
https://github.com/ravidsrk/Rxjava2-Android-Playground  
 
 There are primarily three types of events that your observer can receive:  
  
**onNext(T) :** will be invoked when the source observable emits a particular item (of type T). It will get called multiple times if the source observable has got multiple items to emit.
**onCompleted() :** will be invoked when the source observable completes emitting all of its items. This is a terminal event, and there can be no more items emitted after this point. This simply indicates that the observable has completed successfully.
**onError(Throwable) :** will be invoked when the source observable encounters an error while emitting items. This is also a terminal event, and there can be no more emissions after this point as well. It indicates that the observable has failed. It provides a throwable, which contains details of the error.   
    
 **EXAMPLES**  
   
 Observable<Movie> movieObservable = Observable.create(emitter ->   
  { try { // Fetches Movie objects from the network, database, etc.   
  List<Movie> movies = getMovies();   
  for (Movie movie : movies) {   
  emitter.onNext(movie);   
  } emitter.onComplete();   
  } catch (Exception e)   
  { emitter.onError(e); }   
  });  
    
  DisposableObserver<Movie> disposable =   
  movieObservable .subscribeWith(new DisposableObserver<Movie>() {   
  @Override public void onNext(Movie movie) {   
  // Access your Movie object here   
  } @Override   
  public void onError(Throwable e) { // Show the user that an error has occurred }   
  @Override public void onComplete() { // Show the user that the operation is complete } });  
   
**Explanation of Above Code**     
All we do here is use the subscribeWith() method to subscribe to the movie observable. We are using a DisposableObserver, which has three methods for the three different event types discussed earlier. The onNext(Movie) method will be called every time a Movie object is fetched by the observable. It can be fetched from the network, database, files, or any other source. All that matters is that the observer(s) subscribed to it will always be notified of the events happening in the stream.
  
So, if you have 10 movies in your data store, the onNext() method will be called 10 times with 10 Movie objects. After the operation succeeds, the onComplete() method will be called, but if the operation fails, the onError() method will be called with the appropriate error object.  
  
   
**Dispose, but what?**    
DisposableObserver is nothing but an observer that can be disposed of as it implements the Disposable interface. Whenever an observer subscribes to an observable, a connection is formed between them that effectively needs to be cleared (or terminated) when not needed. Otherwise it can lead to resource leaks.  
   
A listener should not be listening to events eternally; it needs to stop sometime. This is similar to scenarios where you need to close a database cursor or a file input/output stream when you are done using them, because otherwise those unreleased resources can increase the memory footprint or cause leaks.  
  
Your observers are nothing more than garbage after they have done their job. So this is something you can do to dispose of your observables when you don’t need them anymore:  
  
@Override public void onDestroy() {   
if (disposable != null && !disposable.isDisposed()) {   
disposable.dispose();   
}   
super.onDestroy();   
}  
You can also use a CompositeDisposable to add up all your disposables and get rid of all of them at once just like this.
  
#### Operators   
  
Going back to our conference example, suppose a new speaker comes up and starts speaking in German, but the attendees understand only English.  
  
This is where a translator can come into play who can translate every sentence of the speaker into something meaningful that all the attendees can understand.  

Let’s talk about some RxJava operators:  

**filter()** — We can use this operator to refine the items emitted by the source observable and create a new observable containing only those items that match the required condition.  
Suppose our movie observable emits lots of movies having different ratings (from 1 to 5 stars), but we want to show only those movies that have a 5-star rating,  
  
movieObservable.filter(new Predicate<Movie>() {   
  @Override public boolean test(@NonNull Movie movie) throws Exception {   
  return movie.getRating() == 5; } });  
    
And the mighty lambdas can turn it into something such as this:  
  
movieObservable.filter(movie -> movie.getRating() == 5);  
**map()** — We can use this operator to transform items emitted by the source observable into something completely different and create a new observable containing those modified items.  
Suppose we have a requirement that the synopsis of the movies to be shown cannot be more than 500 characters.  
  
Observable<Movie> movieObservable = getMoviesFromDatabase(); 
  movieObservable.map(new Function<Movie, Movie>() {   
  @Override public Movie apply(@NonNull Movie movie) throws Exception {   
  return StringUtils.truncate(movie.getSynopsis(), 500); } });  
   
**skip()** — We can use this operator to skip some items from the beginning source observable and create a new observable that doesn’t have these items.  
Suppose we know that our movie observable always emits a dummy Movie object (containing some metadata) in the beginning of the stream that should not be shown to the user.  
  
movieObservable.skip(1);  
   
**concat()** — We can use this operator to concatenate items from multiple observables one after the other without interleaving them.  
Suppose we have two data sources to fetch movies from—database and network—and we want to show the movies fetched from the database first followed by the ones fetched from the network.  
  
Observable<Movie> database = getMoviesFromDatabase();   
  Observable<Movie> network = getMoviesFromNetwork();   
  Observable<Movie> resultObservable = Observable.concat(database, network);  
We can now subscribe to this resultObservable having movies from the database being emitted before the movies from the network.  
  
We have already observed that the return type of these operator methods is also an observable, which enables us to chain multiple operators one after the other and perform crazy things.   
   
movieObservable .skip(1) .filter(movie -> movie.getRating() == 5) .map(movie -> truncate(movie.getSynopsis(), 500));  
In this example, we are skipping the first item emitted in the stream, then filtering only those movies with a rating of 5, and then truncating the synopsis of each movie item to 500 characters. All of this happens in just four lines of code.  
  
There are hundreds of operators available in RxJava, and explaining each of them would take over 10,000 words. Reading an article that long would be a pain for you, so here is a link to a complete list of all the operators available to you.   
  
**Main concepts**  
  
This article would be incomplete if I didn’t touch upon two important concepts: observeOn/subscribeOn and schedulers.
  
**observeOn/subscribeOn**  
These are just like the other operators discussed, but these can be used to easily control multi-threading in RxJava.
  
**subscribeOn()**  
Use this operator to specify on which thread the source observable will emit its data. This operator works only on the source observable.  
  
Suppose your source observable is supposed to fetch data from the network. Obviously, this operation must be performed in the background thread because Android doesn’t allow network operations on the main thread.  
  
This is where the subscribeOn operator comes into play. You can use this operator only once. If you do use it multiple times, only the one defined closest to the source will take effect.  
  
movieObservable .subscribeOn(Schedulers.io()) .subscribe(movie ->   
{ // Use your movie item here }, throwable -> { // Handle the error here });  
This will make the movie observable operate on the I/O thread. Now see an another variant:  
  
movieObservable .subscribeOn(Schedulers.computation()) .subscribeOn(Schedulers.io()) .subscribe(movie -> {   
// Use your movie item here }, throwable -> { // Handle error here });    
You might be thinking that the second subscribeOn() (with Schedulers.io())   
will take its effect. But only the subscribeOn() defined closest to the source will play its magic and nothing else.  
  
**observeOn()**  
You can use this operator to specify on which thread the observer will observe the emissions.  

Suppose your source observable emits items on the I/O thread. In Android, in order to show something in the UI you must consume data on Android’s main thread only. So this is where observeOn() comes into play.  
  
movieObservable .subscribeOn(Schedulers.io()) .observeOn(AndroidSchedulers.mainThread()) .subscribe(movie -> { 
// Use your movie item here },   
throwable -> {   
// Handle error here });   
Now you will be able to access and show your movie items in the UI as they are all observed in the UI thread. But in the previous example, because observeOn() was not used, all the items were both emitted and observed in the I/O thread.  
  
Unlike with subscribeOn(), we can use observeOn() multiple times for seamless thread switching.  
  
movieObservable .subscribeOn(Schedulers.io())   
.observeOn(Schedulers.computation())   
.flatMap(movie -> truncate(movie.getSynopsis(), 500))   
.observeOn(Schedulers.io())   
.filter(movie -> isInDatabase(movie))   
.observeOn(AndroidSchedulers.mainThread())   
.subscribe(movie -> {    
// Use your movie item here   
}, throwable -> { // Handle error here });  
   
This is a contrived example to make you understand how you might use it in real scenarios. I have used observeOn() three times. The source observable emits items on the I/O thread, then I switch to the computation thread to perform the truncate operation (let’s assume it demands complicated computation) specified just after that.

                                              Insert the diagram here  
                                                
After that, I again switch to the I/O thread to perform the filtering operation where I only take those items that are already present in the database. Now I switch threads for the last time to the main thread so that the observer specified just after that is able to observe and consume items on Android’s main thread.  
  
So, in just seven lines of code, I have done a lot of multi-threading, which would have taken a lot of time and effort if we had to do it in the traditional way.  

**Schedulers**  
Because you have already seen some schedulers used in some of the previous examples and might have been wondering what these things are.  
  
Schedulers represent a particular thread for operations to be performed.  
  
There are several schedulers available in RxJava, including:  
  
**Scheduler.io()**—for operations to be performed on the I/O thread, such as network call, database transactions, file access, etc.  
**Scheduler.computation()**—for operations that are computationally heavy and need to be performed on a thread that is optimized for this purpose, such as parsing a huge dataset of a few million phone numbers.  
**Scheduler.newThread()**—for operations to be performed on a completely new thread. You should probably restrict yourself from creating new threads all the time and use the other schedulers available so that the framework can work on improving the threading performance using techniques such as thread pooling.  
**Scheduler.immediate()**—for testing and debugging purposes where you can perform the operation on the current thread itself and not on a separate thread.  
**AndroidSchedulers.mainThread()**—for operations to be performed on Android’s main thread, such as showing data on the UI. You need to use the RxAndroid library for it, though.  
  
 ## Subjects ##  
 A Subject is a sort of bridge or proxy that is available in some implementations of ReactiveX that acts both as an observer and as an Observable. Because it is an observer, it can subscribe to one or more Observables, and because it is an Observable, it can pass through the items it observes by reemitting them, and it can also emit new items.  
  
Because a Subject subscribes to an Observable, it will trigger that Observable to begin emitting items (if that Observable is “cold” — that is, if it waits for a subscription before it begins to emit items). This can have the effect of making the resulting Subject a “hot” Observable variant of the original “cold” Observable.  
  
**THere are 4 verities of Subjects**  
**1.AsyncSubject**  An AsyncSubject emits the last value (and only the last value) emitted by the source Observable, and only after that source Observable completes. (If the source Observable does not emit any values, the AsyncSubject also completes without emitting any values.)  
**2.BehaviorSubject**  When an observer subscribes to a BehaviorSubject, it begins by emitting the item most recently emitted by the source Observable (or a seed/default value if none has yet been emitted) and then continues to emit any other items emitted later by the source Observable(s).  
**3.PublishSubject**  PublishSubject emits to an observer only those items that are emitted by the source Observable(s) subsequent to the time of the subscription.  
**4.ReplaySubject** ReplaySubject emits to any observer all of the items that were emitted by the source Observable(s), regardless of when the observer subscribes.
  
There are also versions of ReplaySubject that will throw away old items once the replay buffer threatens to grow beyond a certain size, or when a specified timespan has passed since the items were originally emitted.  
  
**SUBJECT IMAGE**  
![alt tag](https://github.com/spdobest/Sp-RxJava/blob/master/images/subject.png) 
  
### Rx Binding ##  


## Back Pressure in RxJava##  
If an observer can handle only 1000 items per second,  but its Observable emits 100000 items per second, what will happen ?

It’s not rare to get into a situation in which an Observable is emitting items more rapidly than a subscriber can consume them.

I have seen this kind of usage in lots of android projects, most of the developers doing this without knowing something is wrong, querying a database and assuming there won’t be lots of data, or calling to a REST API assuming there won’t be lots of data, then it will end up with a poor app performance in production. App will behave slowly or app will freeze time to time. There is a chance to get an Out Of Memory Exception, if this happen app will crash.

When the Observer is not able to consume items as quickly as they are produced by an Observable they need to be buffered or handled in some other way, before they fill up the memory, finally causing OutOfMemoryException.
RxJava provides facility to handle backpressure productively. By handling backpressure properly of a data stream, it’ll be possible to manage emitted items as needed, unnecessary items can be discarded or even let the producer know when to create and emit new items.  
  
What is the problem here?.

Assume this getStudents() method receives students data from a web API.  

The problem of the code here is, or the problem can arise later with this code is,  it’s getting all the items from the API and pushes it to downstream, which will results in high memory usage if there are millions of items , because it buffers all the data into memory.  
  
 We  should  get all of the data provided by the API.  
  
But we do not need all of them at once.
  
###Introduced Flowable class for handling the backpressure.###  
  
In the previous version of RxJava we only had Observable classs.  Observable was only one base class for dealing with backpressure-aware and non-backpressure-aware sources  
  
RxJava 2 introduced a new Observable class called Flllowable , specially prepared to work  with backpressure aware data  sources .    
  
When introducing Flowable , RxJava 2 has provided us different convenient methods to create flowables.  
  
During a earlier chapter of this course we learnt that we can easily create observables from any object or values using just operator.  
  
We can easily create a Flowable from any object or value using just operator . Like we did with for the Observable.  
  
Let me show this with a code example.  
    
This is the simplest way. But, widely used approach to create a flowable  is toFlowable() method.  
  
We can invoke any observables ‘s toFlowable method passing BackpressureStrategy as an argument.  
  
Here is a  code example.   
  
**Backpressure strategies**    
  
**BackpressureStrategy.DROP**

We use this to discard the events that cannot be consumed by the Observer.   

**BackpressureStrategy.BUFFER**

If we use this, the source will buffer all the events until the subscriber can consume them. I recommend this strategy for most of the use cases, because there will be no data loss with this strategy.

**BackpressureStrategy.LATEST**

BackpressureStrategy.LATEST, force  to the source to keep only the latest items, to do that source may need to  overwrite some previous values .

**BackpressureStrategy.MISSING**

We may temporary  pass this value, if we don’t want any backpressure stratergy.

**BackpressureStrategy.ERROR**

If we don’t expect backpressure at all, we can pass BackpressureStrategy.ERROR



In both of the cases( BackpressureStrategy.MISSING,  BackpressureStrategy.ERROR  ), a MissingBackpressureException will be thrown if the observer can’t keep up with the data emitting speed of the source.  
  
  
## RxJava Interview Questions Part 1 ##    
1. What is RxJava?  
    RxJava is the JVM implementation of Reactive Extensions.
  
2. What is meant by "Reactive Extensions " ?  
    Reactive Extensions is  a library for composing asynchronous(different parts of the program run at the same time  ) and event-   based( executes the code based on the events generated by other parts of the  application  ) programs by using observable data  streams .  

3. What is the difference between Observable and Observer?  
    Observable emits  data,Observer gets data.  
  
4. Name different types of Observables ?  
    Flowable, Observable, Single, and Completable   
  
5.For what we use Operators in RxJava?  
   To modify data.  
  
6. What are the Schedulers  in RxJava ?  
   Schedulers are where(thread) the work should be done.  
  
7. What is meant by "subscriber" in RxJava ?  
    Where the response will be sent after work has been completed  .   
8. What is Hot and Cold Observer ?  
https://medium.com/@benlesh/hot-vs-cold-observables-f8094ed53339

  
