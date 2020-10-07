package de.rki.coronawarnapp.ui.main

import dagger.Module
import dagger.android.ContributesAndroidInjector
import de.rki.coronawarnapp.ui.interoperability.InteroperabilityConfigurationFragment
import de.rki.coronawarnapp.ui.interoperability.InteroperabilityConfigurationFragmentModule
import de.rki.coronawarnapp.ui.onboarding.OnboardingDeltaInteroperabilityModule
import de.rki.coronawarnapp.ui.submission.fragment.SubmissionQRCodeInfoFragment
import de.rki.coronawarnapp.ui.submission.fragment.SubmissionQRCodeInfoModule
import de.rki.coronawarnapp.ui.submission.viewmodel.SubmissionQRCodeInfoFragmentViewModel

@Module(includes = [OnboardingDeltaInteroperabilityModule::class])
abstract class MainActivityModule {

    // activity specific injection module for future dependencies

    // example:
    // @ContributesAndroidInjector
    // abstract fun mainFragment(): MainFragment

    @ContributesAndroidInjector(modules = [InteroperabilityConfigurationFragmentModule::class])
    abstract fun intertopConfigScreen(): InteroperabilityConfigurationFragment

    @ContributesAndroidInjector(modules = [SubmissionQRCodeInfoModule::class])
    abstract fun submissionQRCodeInfoScreen(): SubmissionQRCodeInfoFragment
}
