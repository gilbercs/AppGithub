package br.com.gilbercs.github

import android.app.Application
import br.com.gilbercs.github.data.di.DataModule
import br.com.gilbercs.github.domain.di.DomainModule
import br.com.gilbercs.github.presentation.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}