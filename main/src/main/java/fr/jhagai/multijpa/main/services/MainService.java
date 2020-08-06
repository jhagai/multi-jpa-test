package fr.jhagai.multijpa.main.services;

import fr.jhagai.multijpa.main.entities.MainEntity;
import fr.jhagai.multijpa.main.repositories.MainRepository;
import fr.jhagai.multijpa.shared.entities.SharedEntity;
import fr.jhagai.multijpa.shared.repositories.SharedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class MainService {

    @Autowired
    private MainRepository mainRepository;

    @Autowired
    private SharedRepository sharedRepository;

    @Transactional
    public void saveMain() {
        final MainEntity mainEntity = new MainEntity();
        mainEntity.setMainName("main");
        this.mainRepository.save(mainEntity);

        final SharedEntity sharedEntity = new SharedEntity();
        sharedEntity.setSharedName("shared");
        this.sharedRepository.save(sharedEntity);
    }

    @Transactional(readOnly = true)
    public List<Object> loadMain() {
        final List<MainEntity> allMain = this.mainRepository.findAll();
        final List<SharedEntity> allShared = this.sharedRepository.findAll();

        ArrayList<Object> objects = new ArrayList<>();
        objects.addAll(allMain);
        objects.addAll(allShared);
        return objects;
    }
}
