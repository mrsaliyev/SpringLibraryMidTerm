package kz.iitu.librarymidterm.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class PriceChangeEventHandler implements ApplicationListener<PriceChangeEvent> {
    @Override
    public void onApplicationEvent(PriceChangeEvent priceChangeEvent) {
        System.out.println("Changing: " + priceChangeEvent.getBook());
    }
}
