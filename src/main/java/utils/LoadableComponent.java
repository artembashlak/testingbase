package utils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class LoadableComponent<T extends LoadableComponent<T>> {

    @SuppressWarnings("unchecked")
    public T get() {
        try {
            isLoaded();
            return (T) this;
        } catch (Error e) {
            log.error("Error encountered during pages load: ");
            load();
        }

        isLoaded();

        return (T) this;
    }

    protected abstract void load();

    protected abstract void isLoaded() throws Error;
}
