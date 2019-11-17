package grack.dev.creditpointapp

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

object DisposableInstance {

  private val compositeDisposable = CompositeDisposable()

  fun addAll(disposable: Disposable)   {
    compositeDisposable.remove(disposable)
    compositeDisposable.add(disposable)
  }

  fun clearDisposable() {
    compositeDisposable.clear()
  }

}