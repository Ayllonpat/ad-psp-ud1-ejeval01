package com.salesianostriana.dam.resteval;

public record PlaceListDto(
        Long id,
        String nombre,
        String coords,
        String image
) {

    public static PlaceListDto of(Place place){
        return new PlaceListDto(
                place.getId(),
                place.getName(),
                place.getCoords(),
                place.getImage()
        );
    }
}
