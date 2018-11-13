import com.google.inject.Inject;
import com.google.inject.name.Named;

import java.util.Map;

public class PresenterBySite {
    private final Map<String, Presenter> presenters;

    @Inject
    public PresenterBySite(@Named("RodriMap") Map<String, Presenter> presenters) {
        this.presenters = presenters;
    }

    public String presentFor(String site) {
        return this.presenters.get(site).present(null);
    }
}
