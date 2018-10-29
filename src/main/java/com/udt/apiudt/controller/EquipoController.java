package com.udt.apiudt.controller;

import com.example.generated.api.EquiposApi;
import com.example.generated.model.Equipo;
import com.example.generated.model.Equipos;
import com.example.generated.model.Jugador;
import com.example.generated.model.Jugadores;
import org.springframework.http.ResponseEntity;

public class EquipoController implements EquiposApi {
    @Override
    public ResponseEntity<Jugador> equiposEquipoIdEquiposJugadorIdGet(String equipoId, String jugadorId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> equiposEquiposIdDelete() {
        return null;
    }

    @Override
    public ResponseEntity<Equipo> equiposEquiposIdGet(String equiposId) {
        return null;
    }

    @Override
    public ResponseEntity<Jugadores> equiposEquiposIdJugadoresGet(String equiposId) {
        return null;
    }

    @Override
    public ResponseEntity<Jugador> equiposEquiposIdJugadoresPost(String jugadorId) {
        return null;
    }

    @Override
    public ResponseEntity<Equipo> equiposEquiposIdPut(String equiposId) {
        return null;
    }

    @Override
    public ResponseEntity<Equipos> equiposGet() {
        return null;
    }

    @Override
    public ResponseEntity<Void> equiposPost(Equipo equipo) {
        return null;
    }
}
