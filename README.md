> Created and maintained by Gabriel Cruz
> For demo access or proposal inquiries, contact: LinkedIn.com/GabrielC67

## Purpose
Tapr is a contextual gesture-driven smart home system designed for adaptive device control and cross-platform automation.  
It simplifies device coordination through contextual automation—built for smart homes and gesture-based control.

## Status
Core backend structure in place, gesture services in progress. Architecture optimized for scale and user flexibility.
The full gesture orchestration logic is under development and will be released in alignment with Tapr's prototype showcase.

## License
This work is licensed under [Creative Commons Attribution-NonCommercial 4.0 International (CC BY-NC 4.0)].

# Tapr: Gesture-Driven Smart Device Orchestration

Tapr is a contextual automation framework built for intuitive smart home control using gesture recognition and device mapping. With modular backend architecture and scalable entity relationships, Tapr serves as a foundation for responsive user-device ecosystems.

> Note: Proprietary gesture orchestration logic and behavioral mapping models are reserved for private development and are not disclosed in this repository.

---

## 📦 Core Features (Skeleton Overview)

- RESTful controllers for `User`, `Devices`, and `UserAssets`
- Structured entity relationships (`User ↔ UserAssets ↔ Devices`)
- Service-layer design using `BeanUtils.copyProperties()` for clean business logic abstraction
- Repository architecture powered by Spring Data `CrudRepository`

---

## ⚙️ Tech Stack

- **Java** with Spring Boot 3.x
- **JPA / Hibernate** for ORM
- **H2 + MySQL ready** persistence setup
- Modular file system (Controllers, Entities, Services, Repositories)

---

## 🔐 License

This project is licensed under [Creative Commons Attribution-NonCommercial 4.0 International (CC BY-NC 4.0)](https://creativecommons.org/licenses/by-nc/4.0/).  
Commercial use is prohibited without explicit permission. Attribution is required.

---

## 🚧 Status

Core backend architecture is live. Gesture processing module and contextual behavior engine are under development in Tapr's private repository.

For collaboration inquiries or demo access, contact the maintainer directly.
