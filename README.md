# Sp-RxJava

#### What is Reactive Programming ?  
Ans : In Reactive Programming, user Reacts to the data or the output comes in. This is nothing but the Async Programming or reactive Programming.  
  
RxJava is used for reactive programming. In reactive programming, the consumer reacts to the data as it comes in. Reactive programming allows for event changes to propagate to registered observers.  

**ReactiveX** is a technology or project which integrate Reactive Programm using the combination of Observer Pattern,Functional and Iterator Pattern.**RxJava** is the Java implementation of Reactive Programming. It's nothing but user will react on the data we get as output.  

**KEY POINTS**  
* Reactive programming is a specification for dealing with asynchronous streams of data  
* Reactive provides tools for transforming and combining streams and for managing flow-control  
* Marble diagrams provide an interactive canvas for visualizing reactive constructs  
* Resembles Java Streams API but the resemblance is purely superficial  
* Attach to hot streams to attenuate and process asynchronous data feeds  
    
#### Main Building Blogs Reactive Programming  
* **Observables** : This is nothing but the data Emitors i.e Observervables is the Sourse of data which emit data when **Observer** Start listening. Observervables will terminate either by emitting Data Successfully or terminate by showing an Error. Observervables never terminate operation without doing Anything. If we click one Button, it will show Output data successfully or it will show Error.  
* **Observer (or Suscribers in version 1)** : An Observervable have many number of **Observer**. If any data change in the Observable, it will react in the **onNext, onCOmplete or OnError methods**.if the observable finishes its data flow with an error, the onError() method is called on each Observer.  
  
* **Disposable** : It is an interface having two methods **dispose() and isDisposed()**  
  
public interface Disposable {  
  void dispose();  
  boolean isDisposed();  
}    
  
#### What is the need of Reactive Programming ?  
Ans : Reactive Programming is nothing but the Asyncronous Programming. Independent of other task.

Observeable.from(doNetworkOperation()).
SuscribeOn(Scheduler.io).


**RX = OBSERVABLE + OBSERVER + SCHEDULERS**  
  
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
  
**Observable.just()** — Creates an observable around any data type and emits the given item.  
  
**Observable.fromArray()** — Creates an observable that emits all the items of the given array one by one.  
  
**Observable.interval()** — Creates an observable that emits a sequence of integers in a given interval of time.  
  
**Observable.empty()** — Creates an observable that emits nothing and completes successfully.  
  
**Observable.error()** — Creates an observable that emits nothing and throws an error.  
      
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
  
