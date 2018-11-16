import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;
import com.google.inject.name.Names;

public class RodriModule extends AbstractModule {
    @Override
    protected void configure() {
        MapBinder<String, FormaterPresenter> mapbinder = MapBinder.newMapBinder(
                binder(),
                String.class,
                FormaterPresenter.class,
                Names.named("RodriParameter")
        );
        mapbinder.addBinding("MLA").to(FormatterPresenterForMLA.class);
        mapbinder.addBinding("MLB").to(FormatterPresenterForMLB.class);

        MapBinder<String, FormaterPresenter> mapbinderForForms = MapBinder.newMapBinder(
                binder(),
                String.class,
                FormaterPresenter.class,
                Names.named("RodriParameterForForms")
        );
        mapbinderForForms.addBinding("MLA").to(FormFormatterForMLA.class);
        mapbinderForForms.addBinding("MLB").to(FormFormatterForMLB.class);

    }
}
