import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;

public class RodriModule extends AbstractModule {
    @Override
    protected void configure() {
        MapBinder<String, Presenter> mapbinder
                = MapBinder.newMapBinder(binder(), String.class, Presenter.class);
        mapbinder.addBinding("MLA").to(MLA.class);
        mapbinder.addBinding("MLB").to(MLB.class);

    }
}
