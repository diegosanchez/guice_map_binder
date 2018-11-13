import com.google.inject.Inject;

import java.util.Map;

public class PresenterBySite {
    private final Map<String, Presenter> presenters;

    @Inject
    public PresenterBySite(Map<String, Presenter> presenters) {
        this.presenters = presenters;
    }

    public String presentFor(String site) {
        return this.presenters.get(site).present(null);
    }
}
