package com.salesianostriana.dam.resteval;

public record CrearPlaceDto(
        String name,
        String address,
        String coords,
        String desc,
        String image
) {
    public static CrearPlaceDto of(Place place){
        return new CrearPlaceDto(
                place.getName(),
                place.getAddress(),
                place.getCoords(),
                place.getDesc(),
                place.getImage()
        );
    }
}
