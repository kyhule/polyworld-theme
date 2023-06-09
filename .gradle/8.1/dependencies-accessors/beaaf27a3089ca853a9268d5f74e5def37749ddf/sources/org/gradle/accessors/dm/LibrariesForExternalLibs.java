package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `externalLibs` extension.
 */
@NonNullApi
public class LibrariesForExternalLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final AccompanistLibraryAccessors laccForAccompanistLibraryAccessors = new AccompanistLibraryAccessors(owner);
    private final AndroidLibraryAccessors laccForAndroidLibraryAccessors = new AndroidLibraryAccessors(owner);
    private final AndroidxLibraryAccessors laccForAndroidxLibraryAccessors = new AndroidxLibraryAccessors(owner);
    private final AssertjLibraryAccessors laccForAssertjLibraryAccessors = new AssertjLibraryAccessors(owner);
    private final CoilLibraryAccessors laccForCoilLibraryAccessors = new CoilLibraryAccessors(owner);
    private final DaggerLibraryAccessors laccForDaggerLibraryAccessors = new DaggerLibraryAccessors(owner);
    private final JavaxLibraryAccessors laccForJavaxLibraryAccessors = new JavaxLibraryAccessors(owner);
    private final KotlinxLibraryAccessors laccForKotlinxLibraryAccessors = new KotlinxLibraryAccessors(owner);
    private final Okhttp3LibraryAccessors laccForOkhttp3LibraryAccessors = new Okhttp3LibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForExternalLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

        /**
         * Creates a dependency provider for anvilAnnotations (com.squareup.anvil:annotations)
         * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
         */
        public Provider<MinimalExternalModuleDependency> getAnvilAnnotations() {
            return create("anvilAnnotations");
    }

        /**
         * Creates a dependency provider for guava (com.google.guava:guava)
         * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
         */
        public Provider<MinimalExternalModuleDependency> getGuava() {
            return create("guava");
    }

        /**
         * Creates a dependency provider for hamcrest (org.hamcrest:hamcrest)
         * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
         */
        public Provider<MinimalExternalModuleDependency> getHamcrest() {
            return create("hamcrest");
    }

        /**
         * Creates a dependency provider for junit (junit:junit)
         * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
         */
        public Provider<MinimalExternalModuleDependency> getJunit() {
            return create("junit");
    }

        /**
         * Creates a dependency provider for kotlinLogging (io.github.microutils:kotlin-logging-jvm)
         * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
         */
        public Provider<MinimalExternalModuleDependency> getKotlinLogging() {
            return create("kotlinLogging");
    }

        /**
         * Creates a dependency provider for logbackAndroid (com.github.tony19:logback-android)
         * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
         */
        public Provider<MinimalExternalModuleDependency> getLogbackAndroid() {
            return create("logbackAndroid");
    }

        /**
         * Creates a dependency provider for moshi (com.squareup.moshi:moshi)
         * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
         */
        public Provider<MinimalExternalModuleDependency> getMoshi() {
            return create("moshi");
    }

        /**
         * Creates a dependency provider for moshiKotlin (com.squareup.moshi:moshi-kotlin)
         * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
         */
        public Provider<MinimalExternalModuleDependency> getMoshiKotlin() {
            return create("moshiKotlin");
    }

        /**
         * Creates a dependency provider for moshiKotlinCodegen (com.squareup.moshi:moshi-kotlin-codegen)
         * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
         */
        public Provider<MinimalExternalModuleDependency> getMoshiKotlinCodegen() {
            return create("moshiKotlinCodegen");
    }

        /**
         * Creates a dependency provider for okio (com.squareup.okio:okio)
         * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
         */
        public Provider<MinimalExternalModuleDependency> getOkio() {
            return create("okio");
    }

        /**
         * Creates a dependency provider for truth (com.google.truth:truth)
         * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
         */
        public Provider<MinimalExternalModuleDependency> getTruth() {
            return create("truth");
    }

        /**
         * Creates a dependency provider for turbine (app.cash.turbine:turbine)
         * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
         */
        public Provider<MinimalExternalModuleDependency> getTurbine() {
            return create("turbine");
    }

    /**
     * Returns the group of libraries at accompanist
     */
    public AccompanistLibraryAccessors getAccompanist() {
        return laccForAccompanistLibraryAccessors;
    }

    /**
     * Returns the group of libraries at android
     */
    public AndroidLibraryAccessors getAndroid() {
        return laccForAndroidLibraryAccessors;
    }

    /**
     * Returns the group of libraries at androidx
     */
    public AndroidxLibraryAccessors getAndroidx() {
        return laccForAndroidxLibraryAccessors;
    }

    /**
     * Returns the group of libraries at assertj
     */
    public AssertjLibraryAccessors getAssertj() {
        return laccForAssertjLibraryAccessors;
    }

    /**
     * Returns the group of libraries at coil
     */
    public CoilLibraryAccessors getCoil() {
        return laccForCoilLibraryAccessors;
    }

    /**
     * Returns the group of libraries at dagger
     */
    public DaggerLibraryAccessors getDagger() {
        return laccForDaggerLibraryAccessors;
    }

    /**
     * Returns the group of libraries at javax
     */
    public JavaxLibraryAccessors getJavax() {
        return laccForJavaxLibraryAccessors;
    }

    /**
     * Returns the group of libraries at kotlinx
     */
    public KotlinxLibraryAccessors getKotlinx() {
        return laccForKotlinxLibraryAccessors;
    }

    /**
     * Returns the group of libraries at okhttp3
     */
    public Okhttp3LibraryAccessors getOkhttp3() {
        return laccForOkhttp3LibraryAccessors;
    }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() {
        return baccForBundleAccessors;
    }

    /**
     * Returns the group of plugins at plugins
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    public static class AccompanistLibraryAccessors extends SubDependencyFactory {
        private final AccompanistNavigationLibraryAccessors laccForAccompanistNavigationLibraryAccessors = new AccompanistNavigationLibraryAccessors(owner);

        public AccompanistLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for pager (com.google.accompanist:accompanist-pager)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getPager() {
                return create("accompanist.pager");
        }

            /**
             * Creates a dependency provider for pagerIndicators (com.google.accompanist:accompanist-pager-indicators)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getPagerIndicators() {
                return create("accompanist.pagerIndicators");
        }

            /**
             * Creates a dependency provider for permissions (com.google.accompanist:accompanist-permissions)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getPermissions() {
                return create("accompanist.permissions");
        }

            /**
             * Creates a dependency provider for systemuicontroller (com.google.accompanist:accompanist-systemuicontroller)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getSystemuicontroller() {
                return create("accompanist.systemuicontroller");
        }

        /**
         * Returns the group of libraries at accompanist.navigation
         */
        public AccompanistNavigationLibraryAccessors getNavigation() {
            return laccForAccompanistNavigationLibraryAccessors;
        }

    }

    public static class AccompanistNavigationLibraryAccessors extends SubDependencyFactory {

        public AccompanistNavigationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for animation (com.google.accompanist:accompanist-navigation-animation)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getAnimation() {
                return create("accompanist.navigation.animation");
        }

            /**
             * Creates a dependency provider for material (com.google.accompanist:accompanist-navigation-material)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getMaterial() {
                return create("accompanist.navigation.material");
        }

    }

    public static class AndroidLibraryAccessors extends SubDependencyFactory {

        public AndroidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for material (com.google.android.material:material)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getMaterial() {
                return create("android.material");
        }

    }

    public static class AndroidxLibraryAccessors extends SubDependencyFactory {
        private final AndroidxActivityLibraryAccessors laccForAndroidxActivityLibraryAccessors = new AndroidxActivityLibraryAccessors(owner);
        private final AndroidxArchLibraryAccessors laccForAndroidxArchLibraryAccessors = new AndroidxArchLibraryAccessors(owner);
        private final AndroidxComposeLibraryAccessors laccForAndroidxComposeLibraryAccessors = new AndroidxComposeLibraryAccessors(owner);
        private final AndroidxConstraintlayoutLibraryAccessors laccForAndroidxConstraintlayoutLibraryAccessors = new AndroidxConstraintlayoutLibraryAccessors(owner);
        private final AndroidxLifecycleLibraryAccessors laccForAndroidxLifecycleLibraryAccessors = new AndroidxLifecycleLibraryAccessors(owner);
        private final AndroidxNavigationLibraryAccessors laccForAndroidxNavigationLibraryAccessors = new AndroidxNavigationLibraryAccessors(owner);
        private final AndroidxPreferenceLibraryAccessors laccForAndroidxPreferenceLibraryAccessors = new AndroidxPreferenceLibraryAccessors(owner);
        private final AndroidxTestLibraryAccessors laccForAndroidxTestLibraryAccessors = new AndroidxTestLibraryAccessors(owner);

        public AndroidxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for annotation (androidx.annotation:annotation)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getAnnotation() {
                return create("androidx.annotation");
        }

            /**
             * Creates a dependency provider for appcompat (androidx.appcompat:appcompat)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getAppcompat() {
                return create("androidx.appcompat");
        }

            /**
             * Creates a dependency provider for browser (androidx.browser:browser)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getBrowser() {
                return create("androidx.browser");
        }

            /**
             * Creates a dependency provider for cardview (androidx.cardview:cardview)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getCardview() {
                return create("androidx.cardview");
        }

            /**
             * Creates a dependency provider for coordinatorlayout (androidx.coordinatorlayout:coordinatorlayout)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getCoordinatorlayout() {
                return create("androidx.coordinatorlayout");
        }

            /**
             * Creates a dependency provider for core (androidx.core:core)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("androidx.core");
        }

            /**
             * Creates a dependency provider for coreKtx (androidx.core:core-ktx)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getCoreKtx() {
                return create("androidx.coreKtx");
        }

            /**
             * Creates a dependency provider for drawerlayout (androidx.drawerlayout:drawerlayout)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getDrawerlayout() {
                return create("androidx.drawerlayout");
        }

            /**
             * Creates a dependency provider for fragment (androidx.fragment:fragment)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getFragment() {
                return create("androidx.fragment");
        }

            /**
             * Creates a dependency provider for fragmentKtx (androidx.fragment:fragment-ktx)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getFragmentKtx() {
                return create("androidx.fragmentKtx");
        }

            /**
             * Creates a dependency provider for fragmentTesting (androidx.fragment:fragment-testing)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getFragmentTesting() {
                return create("androidx.fragmentTesting");
        }

            /**
             * Creates a dependency provider for localbroadcastmanager (androidx.localbroadcastmanager:localbroadcastmanager)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getLocalbroadcastmanager() {
                return create("androidx.localbroadcastmanager");
        }

            /**
             * Creates a dependency provider for multidex (androidx.multidex:multidex)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getMultidex() {
                return create("androidx.multidex");
        }

            /**
             * Creates a dependency provider for recyclerview (androidx.recyclerview:recyclerview)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getRecyclerview() {
                return create("androidx.recyclerview");
        }

            /**
             * Creates a dependency provider for swiperefreshlayout (androidx.swiperefreshlayout:swiperefreshlayout)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getSwiperefreshlayout() {
                return create("androidx.swiperefreshlayout");
        }

            /**
             * Creates a dependency provider for transition (androidx.transition:transition)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getTransition() {
                return create("androidx.transition");
        }

            /**
             * Creates a dependency provider for transitionKtx (androidx.transition:transition-ktx)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getTransitionKtx() {
                return create("androidx.transitionKtx");
        }

            /**
             * Creates a dependency provider for viewpager (androidx.viewpager:viewpager)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getViewpager() {
                return create("androidx.viewpager");
        }

            /**
             * Creates a dependency provider for viewpager2 (androidx.viewpager2:viewpager2)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getViewpager2() {
                return create("androidx.viewpager2");
        }

        /**
         * Returns the group of libraries at androidx.activity
         */
        public AndroidxActivityLibraryAccessors getActivity() {
            return laccForAndroidxActivityLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.arch
         */
        public AndroidxArchLibraryAccessors getArch() {
            return laccForAndroidxArchLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.compose
         */
        public AndroidxComposeLibraryAccessors getCompose() {
            return laccForAndroidxComposeLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.constraintlayout
         */
        public AndroidxConstraintlayoutLibraryAccessors getConstraintlayout() {
            return laccForAndroidxConstraintlayoutLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.lifecycle
         */
        public AndroidxLifecycleLibraryAccessors getLifecycle() {
            return laccForAndroidxLifecycleLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.navigation
         */
        public AndroidxNavigationLibraryAccessors getNavigation() {
            return laccForAndroidxNavigationLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.preference
         */
        public AndroidxPreferenceLibraryAccessors getPreference() {
            return laccForAndroidxPreferenceLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.test
         */
        public AndroidxTestLibraryAccessors getTest() {
            return laccForAndroidxTestLibraryAccessors;
        }

    }

    public static class AndroidxActivityLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public AndroidxActivityLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for activity (androidx.activity:activity)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("androidx.activity");
        }

            /**
             * Creates a dependency provider for compose (androidx.activity:activity-compose)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getCompose() {
                return create("androidx.activity.compose");
        }

            /**
             * Creates a dependency provider for ktx (androidx.activity:activity-ktx)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("androidx.activity.ktx");
        }

    }

    public static class AndroidxArchLibraryAccessors extends SubDependencyFactory {

        public AndroidxArchLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (androidx.arch.core:core-runtime)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("androidx.arch.core");
        }

            /**
             * Creates a dependency provider for coreTesting (androidx.arch.core:core-testing)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getCoreTesting() {
                return create("androidx.arch.coreTesting");
        }

    }

    public static class AndroidxComposeLibraryAccessors extends SubDependencyFactory {

        public AndroidxComposeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for animation (androidx.compose.animation:animation)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getAnimation() {
                return create("androidx.compose.animation");
        }

            /**
             * Creates a dependency provider for animationCore (androidx.compose.animation:animation-core)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getAnimationCore() {
                return create("androidx.compose.animationCore");
        }

            /**
             * Creates a dependency provider for animationGraphics (androidx.compose.animation:animation-graphics)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getAnimationGraphics() {
                return create("androidx.compose.animationGraphics");
        }

            /**
             * Creates a dependency provider for foundation (androidx.compose.foundation:foundation)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getFoundation() {
                return create("androidx.compose.foundation");
        }

            /**
             * Creates a dependency provider for foundationLayout (androidx.compose.foundation:foundation-layout)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getFoundationLayout() {
                return create("androidx.compose.foundationLayout");
        }

            /**
             * Creates a dependency provider for material (androidx.compose.material:material)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getMaterial() {
                return create("androidx.compose.material");
        }

            /**
             * Creates a dependency provider for material3 (androidx.compose.material3:material3)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getMaterial3() {
                return create("androidx.compose.material3");
        }

            /**
             * Creates a dependency provider for material3WindowSizeClass (androidx.compose.material3:material3-window-size-class)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getMaterial3WindowSizeClass() {
                return create("androidx.compose.material3WindowSizeClass");
        }

            /**
             * Creates a dependency provider for materialIconsCore (androidx.compose.material:material-icons-core)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getMaterialIconsCore() {
                return create("androidx.compose.materialIconsCore");
        }

            /**
             * Creates a dependency provider for materialIconsExtended (androidx.compose.material:material-icons-extended)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getMaterialIconsExtended() {
                return create("androidx.compose.materialIconsExtended");
        }

            /**
             * Creates a dependency provider for materialRipple (androidx.compose.material:material-ripple)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getMaterialRipple() {
                return create("androidx.compose.materialRipple");
        }

            /**
             * Creates a dependency provider for runtime (androidx.compose.runtime:runtime)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() {
                return create("androidx.compose.runtime");
        }

            /**
             * Creates a dependency provider for runtimeLivedata (androidx.compose.runtime:runtime-livedata)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getRuntimeLivedata() {
                return create("androidx.compose.runtimeLivedata");
        }

            /**
             * Creates a dependency provider for runtimeRxjava2 (androidx.compose.runtime:runtime-rxjava2)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getRuntimeRxjava2() {
                return create("androidx.compose.runtimeRxjava2");
        }

            /**
             * Creates a dependency provider for runtimeRxjava3 (androidx.compose.runtime:runtime-rxjava3)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getRuntimeRxjava3() {
                return create("androidx.compose.runtimeRxjava3");
        }

            /**
             * Creates a dependency provider for runtimeSaveable (androidx.compose.runtime:runtime-saveable)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getRuntimeSaveable() {
                return create("androidx.compose.runtimeSaveable");
        }

            /**
             * Creates a dependency provider for ui (androidx.compose.ui:ui)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getUi() {
                return create("androidx.compose.ui");
        }

            /**
             * Creates a dependency provider for uiGeometry (androidx.compose.ui:ui-geometry)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getUiGeometry() {
                return create("androidx.compose.uiGeometry");
        }

            /**
             * Creates a dependency provider for uiGraphics (androidx.compose.ui:ui-graphics)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getUiGraphics() {
                return create("androidx.compose.uiGraphics");
        }

            /**
             * Creates a dependency provider for uiTest (androidx.compose.ui:ui-test)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getUiTest() {
                return create("androidx.compose.uiTest");
        }

            /**
             * Creates a dependency provider for uiTestJunit4 (androidx.compose.ui:ui-test-junit4)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getUiTestJunit4() {
                return create("androidx.compose.uiTestJunit4");
        }

            /**
             * Creates a dependency provider for uiTestManifest (androidx.compose.ui:ui-test-manifest)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getUiTestManifest() {
                return create("androidx.compose.uiTestManifest");
        }

            /**
             * Creates a dependency provider for uiText (androidx.compose.ui:ui-text)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getUiText() {
                return create("androidx.compose.uiText");
        }

            /**
             * Creates a dependency provider for uiTextGoogleFonts (androidx.compose.ui:ui-text-google-fonts)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getUiTextGoogleFonts() {
                return create("androidx.compose.uiTextGoogleFonts");
        }

            /**
             * Creates a dependency provider for uiTooling (androidx.compose.ui:ui-tooling)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getUiTooling() {
                return create("androidx.compose.uiTooling");
        }

            /**
             * Creates a dependency provider for uiToolingData (androidx.compose.ui:ui-tooling-data)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getUiToolingData() {
                return create("androidx.compose.uiToolingData");
        }

            /**
             * Creates a dependency provider for uiToolingPreview (androidx.compose.ui:ui-tooling-preview)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getUiToolingPreview() {
                return create("androidx.compose.uiToolingPreview");
        }

            /**
             * Creates a dependency provider for uiUnit (androidx.compose.ui:ui-unit)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getUiUnit() {
                return create("androidx.compose.uiUnit");
        }

            /**
             * Creates a dependency provider for uiUtil (androidx.compose.ui:ui-util)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getUiUtil() {
                return create("androidx.compose.uiUtil");
        }

            /**
             * Creates a dependency provider for uiViewbinding (androidx.compose.ui:ui-viewbinding)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getUiViewbinding() {
                return create("androidx.compose.uiViewbinding");
        }

    }

    public static class AndroidxConstraintlayoutLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public AndroidxConstraintlayoutLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for constraintlayout (androidx.constraintlayout:constraintlayout)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("androidx.constraintlayout");
        }

            /**
             * Creates a dependency provider for compose (androidx.constraintlayout:constraintlayout-compose)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getCompose() {
                return create("androidx.constraintlayout.compose");
        }

    }

    public static class AndroidxLifecycleLibraryAccessors extends SubDependencyFactory {

        public AndroidxLifecycleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for common (androidx.lifecycle:lifecycle-common)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getCommon() {
                return create("androidx.lifecycle.common");
        }

            /**
             * Creates a dependency provider for compiler (androidx.lifecycle:lifecycle-compiler)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() {
                return create("androidx.lifecycle.compiler");
        }

            /**
             * Creates a dependency provider for livedata (androidx.lifecycle:lifecycle-livedata)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getLivedata() {
                return create("androidx.lifecycle.livedata");
        }

            /**
             * Creates a dependency provider for livedataCore (androidx.lifecycle:lifecycle-livedata-core)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getLivedataCore() {
                return create("androidx.lifecycle.livedataCore");
        }

            /**
             * Creates a dependency provider for livedataKtx (androidx.lifecycle:lifecycle-livedata-ktx)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getLivedataKtx() {
                return create("androidx.lifecycle.livedataKtx");
        }

            /**
             * Creates a dependency provider for process (androidx.lifecycle:lifecycle-process)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getProcess() {
                return create("androidx.lifecycle.process");
        }

            /**
             * Creates a dependency provider for runtime (androidx.lifecycle:lifecycle-runtime)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() {
                return create("androidx.lifecycle.runtime");
        }

            /**
             * Creates a dependency provider for runtimeKtx (androidx.lifecycle:lifecycle-runtime-ktx)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getRuntimeKtx() {
                return create("androidx.lifecycle.runtimeKtx");
        }

            /**
             * Creates a dependency provider for service (androidx.lifecycle:lifecycle-service)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getService() {
                return create("androidx.lifecycle.service");
        }

            /**
             * Creates a dependency provider for viewmodel (androidx.lifecycle:lifecycle-viewmodel)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getViewmodel() {
                return create("androidx.lifecycle.viewmodel");
        }

            /**
             * Creates a dependency provider for viewmodelCompose (androidx.lifecycle:lifecycle-viewmodel-compose)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getViewmodelCompose() {
                return create("androidx.lifecycle.viewmodelCompose");
        }

            /**
             * Creates a dependency provider for viewmodelKtx (androidx.lifecycle:lifecycle-viewmodel-ktx)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getViewmodelKtx() {
                return create("androidx.lifecycle.viewmodelKtx");
        }

            /**
             * Creates a dependency provider for viewmodelSavedstate (androidx.lifecycle:lifecycle-viewmodel-savedstate)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getViewmodelSavedstate() {
                return create("androidx.lifecycle.viewmodelSavedstate");
        }

    }

    public static class AndroidxNavigationLibraryAccessors extends SubDependencyFactory {

        public AndroidxNavigationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for common (androidx.navigation:navigation-common)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getCommon() {
                return create("androidx.navigation.common");
        }

            /**
             * Creates a dependency provider for compose (androidx.navigation:navigation-compose)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getCompose() {
                return create("androidx.navigation.compose");
        }

            /**
             * Creates a dependency provider for fragment (androidx.navigation:navigation-fragment)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getFragment() {
                return create("androidx.navigation.fragment");
        }

            /**
             * Creates a dependency provider for fragmentKtx (androidx.navigation:navigation-fragment-ktx)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getFragmentKtx() {
                return create("androidx.navigation.fragmentKtx");
        }

            /**
             * Creates a dependency provider for runtime (androidx.navigation:navigation-runtime)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getRuntime() {
                return create("androidx.navigation.runtime");
        }

            /**
             * Creates a dependency provider for safeArgsGradlePlugin (androidx.navigation:navigation-safe-args-gradle-plugin)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getSafeArgsGradlePlugin() {
                return create("androidx.navigation.safeArgsGradlePlugin");
        }

            /**
             * Creates a dependency provider for testing (androidx.navigation:navigation-testing)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getTesting() {
                return create("androidx.navigation.testing");
        }

            /**
             * Creates a dependency provider for ui (androidx.navigation:navigation-ui)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getUi() {
                return create("androidx.navigation.ui");
        }

            /**
             * Creates a dependency provider for uiKtx (androidx.navigation:navigation-ui-ktx)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getUiKtx() {
                return create("androidx.navigation.uiKtx");
        }

    }

    public static class AndroidxPreferenceLibraryAccessors extends SubDependencyFactory {

        public AndroidxPreferenceLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for preference (androidx.preference:preference)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getPreference() {
                return create("androidx.preference.preference");
        }

            /**
             * Creates a dependency provider for preferenceKtx (androidx.preference:preference-ktx)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getPreferenceKtx() {
                return create("androidx.preference.preferenceKtx");
        }

    }

    public static class AndroidxTestLibraryAccessors extends SubDependencyFactory {

        public AndroidxTestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (androidx.test:core)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("androidx.test.core");
        }

            /**
             * Creates a dependency provider for espressoAccessibility (androidx.test.espresso:espresso-accessibility)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getEspressoAccessibility() {
                return create("androidx.test.espressoAccessibility");
        }

            /**
             * Creates a dependency provider for espressoContrib (androidx.test.espresso:espresso-contrib)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getEspressoContrib() {
                return create("androidx.test.espressoContrib");
        }

            /**
             * Creates a dependency provider for espressoCore (androidx.test.espresso:espresso-core)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getEspressoCore() {
                return create("androidx.test.espressoCore");
        }

            /**
             * Creates a dependency provider for espressoIdlingResource (androidx.test.espresso:espresso-idling-resource)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getEspressoIdlingResource() {
                return create("androidx.test.espressoIdlingResource");
        }

            /**
             * Creates a dependency provider for espressoIntents (androidx.test.espresso:espresso-intents)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getEspressoIntents() {
                return create("androidx.test.espressoIntents");
        }

            /**
             * Creates a dependency provider for espressoWeb (androidx.test.espresso:espresso-web)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getEspressoWeb() {
                return create("androidx.test.espressoWeb");
        }

            /**
             * Creates a dependency provider for extJunit (androidx.test.ext:junit)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getExtJunit() {
                return create("androidx.test.extJunit");
        }

            /**
             * Creates a dependency provider for extTruth (androidx.test.ext:truth)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getExtTruth() {
                return create("androidx.test.extTruth");
        }

            /**
             * Creates a dependency provider for monitor (androidx.test:monitor)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getMonitor() {
                return create("androidx.test.monitor");
        }

            /**
             * Creates a dependency provider for orchestrator (androidx.test:orchestrator)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getOrchestrator() {
                return create("androidx.test.orchestrator");
        }

            /**
             * Creates a dependency provider for rules (androidx.test:rules)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getRules() {
                return create("androidx.test.rules");
        }

            /**
             * Creates a dependency provider for runner (androidx.test:runner)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getRunner() {
                return create("androidx.test.runner");
        }

            /**
             * Creates a dependency provider for uiautomator (androidx.test.uiautomator:uiautomator)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getUiautomator() {
                return create("androidx.test.uiautomator");
        }

    }

    public static class AssertjLibraryAccessors extends SubDependencyFactory {

        public AssertjLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (org.assertj:assertj-core)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("assertj.core");
        }

    }

    public static class CoilLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public CoilLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for coil (io.coil-kt:coil)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("coil");
        }

            /**
             * Creates a dependency provider for compose (io.coil-kt:coil-compose)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getCompose() {
                return create("coil.compose");
        }

            /**
             * Creates a dependency provider for gif (io.coil-kt:coil-gif)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getGif() {
                return create("coil.gif");
        }

            /**
             * Creates a dependency provider for svg (io.coil-kt:coil-svg)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getSvg() {
                return create("coil.svg");
        }

    }

    public static class DaggerLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public DaggerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for dagger (com.google.dagger:dagger)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("dagger");
        }

            /**
             * Creates a dependency provider for compiler (com.google.dagger:dagger-compiler)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() {
                return create("dagger.compiler");
        }

    }

    public static class JavaxLibraryAccessors extends SubDependencyFactory {

        public JavaxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for annotationApi (javax.annotation:javax.annotation-api)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getAnnotationApi() {
                return create("javax.annotationApi");
        }

            /**
             * Creates a dependency provider for inject (javax.inject:javax.inject)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getInject() {
                return create("javax.inject");
        }

    }

    public static class KotlinxLibraryAccessors extends SubDependencyFactory {
        private final KotlinxCoroutinesLibraryAccessors laccForKotlinxCoroutinesLibraryAccessors = new KotlinxCoroutinesLibraryAccessors(owner);
        private final KotlinxSerializationLibraryAccessors laccForKotlinxSerializationLibraryAccessors = new KotlinxSerializationLibraryAccessors(owner);

        public KotlinxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at kotlinx.coroutines
         */
        public KotlinxCoroutinesLibraryAccessors getCoroutines() {
            return laccForKotlinxCoroutinesLibraryAccessors;
        }

        /**
         * Returns the group of libraries at kotlinx.serialization
         */
        public KotlinxSerializationLibraryAccessors getSerialization() {
            return laccForKotlinxSerializationLibraryAccessors;
        }

    }

    public static class KotlinxCoroutinesLibraryAccessors extends SubDependencyFactory {

        public KotlinxCoroutinesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (org.jetbrains.kotlinx:kotlinx-coroutines-android)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() {
                return create("kotlinx.coroutines.android");
        }

            /**
             * Creates a dependency provider for core (org.jetbrains.kotlinx:kotlinx-coroutines-core)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("kotlinx.coroutines.core");
        }

            /**
             * Creates a dependency provider for coreJvm (org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getCoreJvm() {
                return create("kotlinx.coroutines.coreJvm");
        }

            /**
             * Creates a dependency provider for jdk8 (org.jetbrains.kotlinx:kotlinx-coroutines-jdk8)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getJdk8() {
                return create("kotlinx.coroutines.jdk8");
        }

            /**
             * Creates a dependency provider for playServices (org.jetbrains.kotlinx:kotlinx-coroutines-play-services)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getPlayServices() {
                return create("kotlinx.coroutines.playServices");
        }

            /**
             * Creates a dependency provider for rx2 (org.jetbrains.kotlinx:kotlinx-coroutines-rx2)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getRx2() {
                return create("kotlinx.coroutines.rx2");
        }

            /**
             * Creates a dependency provider for test (org.jetbrains.kotlinx:kotlinx-coroutines-test)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getTest() {
                return create("kotlinx.coroutines.test");
        }

    }

    public static class KotlinxSerializationLibraryAccessors extends SubDependencyFactory {

        public KotlinxSerializationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (org.jetbrains.kotlinx:kotlinx-serialization-core)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("kotlinx.serialization.core");
        }

            /**
             * Creates a dependency provider for json (org.jetbrains.kotlinx:kotlinx-serialization-json)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getJson() {
                return create("kotlinx.serialization.json");
        }

    }

    public static class Okhttp3LibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public Okhttp3LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for okhttp3 (com.squareup.okhttp3:okhttp)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("okhttp3");
        }

            /**
             * Creates a dependency provider for loggingInterceptor (com.squareup.okhttp3:logging-interceptor)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getLoggingInterceptor() {
                return create("okhttp3.loggingInterceptor");
        }

            /**
             * Creates a dependency provider for urlconnection (com.squareup.okhttp3:okhttp-urlconnection)
             * This dependency was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<MinimalExternalModuleDependency> getUrlconnection() {
                return create("okhttp3.urlconnection");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final AndroidxVersionAccessors vaccForAndroidxVersionAccessors = new AndroidxVersionAccessors(providers, config);
        private final KotlinxVersionAccessors vaccForKotlinxVersionAccessors = new KotlinxVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: accompanist (0.30.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<String> getAccompanist() { return getVersion("accompanist"); }

            /**
             * Returns the version associated to this alias: anvil (2.4.6)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<String> getAnvil() { return getVersion("anvil"); }

            /**
             * Returns the version associated to this alias: coil (2.4.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<String> getCoil() { return getVersion("coil"); }

            /**
             * Returns the version associated to this alias: dagger (2.46.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<String> getDagger() { return getVersion("dagger"); }

            /**
             * Returns the version associated to this alias: moshi (1.15.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<String> getMoshi() { return getVersion("moshi"); }

            /**
             * Returns the version associated to this alias: okhttp3 (4.11.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<String> getOkhttp3() { return getVersion("okhttp3"); }

            /**
             * Returns the version associated to this alias: okio (3.3.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<String> getOkio() { return getVersion("okio"); }

        /**
         * Returns the group of versions at versions.androidx
         */
        public AndroidxVersionAccessors getAndroidx() {
            return vaccForAndroidxVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.kotlinx
         */
        public KotlinxVersionAccessors getKotlinx() {
            return vaccForKotlinxVersionAccessors;
        }

    }

    public static class AndroidxVersionAccessors extends VersionFactory  {

        private final AndroidxArchVersionAccessors vaccForAndroidxArchVersionAccessors = new AndroidxArchVersionAccessors(providers, config);
        private final AndroidxTestVersionAccessors vaccForAndroidxTestVersionAccessors = new AndroidxTestVersionAccessors(providers, config);
        public AndroidxVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: androidx.activity (1.7.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<String> getActivity() { return getVersion("androidx.activity"); }

            /**
             * Returns the version associated to this alias: androidx.annotation (1.6.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<String> getAnnotation() { return getVersion("androidx.annotation"); }

            /**
             * Returns the version associated to this alias: androidx.core (1.10.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<String> getCore() { return getVersion("androidx.core"); }

            /**
             * Returns the version associated to this alias: androidx.fragment (1.5.7)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<String> getFragment() { return getVersion("androidx.fragment"); }

            /**
             * Returns the version associated to this alias: androidx.lifecycle (2.6.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<String> getLifecycle() { return getVersion("androidx.lifecycle"); }

            /**
             * Returns the version associated to this alias: androidx.navigation (2.5.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<String> getNavigation() { return getVersion("androidx.navigation"); }

            /**
             * Returns the version associated to this alias: androidx.preference (1.2.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<String> getPreference() { return getVersion("androidx.preference"); }

            /**
             * Returns the version associated to this alias: androidx.transition (1.4.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<String> getTransition() { return getVersion("androidx.transition"); }

        /**
         * Returns the group of versions at versions.androidx.arch
         */
        public AndroidxArchVersionAccessors getArch() {
            return vaccForAndroidxArchVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.androidx.test
         */
        public AndroidxTestVersionAccessors getTest() {
            return vaccForAndroidxTestVersionAccessors;
        }

    }

    public static class AndroidxArchVersionAccessors extends VersionFactory  {

        public AndroidxArchVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: androidx.arch.core (2.2.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<String> getCore() { return getVersion("androidx.arch.core"); }

    }

    public static class AndroidxTestVersionAccessors extends VersionFactory  {

        public AndroidxTestVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: androidx.test.core (1.5.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<String> getCore() { return getVersion("androidx.test.core"); }

            /**
             * Returns the version associated to this alias: androidx.test.espresso (3.5.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<String> getEspresso() { return getVersion("androidx.test.espresso"); }

            /**
             * Returns the version associated to this alias: androidx.test.extJunit (1.1.5)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<String> getExtJunit() { return getVersion("androidx.test.extJunit"); }

            /**
             * Returns the version associated to this alias: androidx.test.extTruth (1.5.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<String> getExtTruth() { return getVersion("androidx.test.extTruth"); }

            /**
             * Returns the version associated to this alias: androidx.test.monitor (1.6.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<String> getMonitor() { return getVersion("androidx.test.monitor"); }

            /**
             * Returns the version associated to this alias: androidx.test.orchestrator (1.4.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<String> getOrchestrator() { return getVersion("androidx.test.orchestrator"); }

            /**
             * Returns the version associated to this alias: androidx.test.rules (1.5.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<String> getRules() { return getVersion("androidx.test.rules"); }

            /**
             * Returns the version associated to this alias: androidx.test.runner (1.5.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<String> getRunner() { return getVersion("androidx.test.runner"); }

            /**
             * Returns the version associated to this alias: androidx.test.uiautomator (2.2.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<String> getUiautomator() { return getVersion("androidx.test.uiautomator"); }

    }

    public static class KotlinxVersionAccessors extends VersionFactory  {

        public KotlinxVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: kotlinx.coroutines (1.7.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<String> getCoroutines() { return getVersion("kotlinx.coroutines"); }

            /**
             * Returns the version associated to this alias: kotlinx.serialization (1.5.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog com.github.kyhule.polyworld.build:polyworld-external-catalog:1.0.0
             */
            public Provider<String> getSerialization() { return getVersion("kotlinx.serialization"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

    }

    public static class PluginAccessors extends PluginFactory {

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

    }

}
