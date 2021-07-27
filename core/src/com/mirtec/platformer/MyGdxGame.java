package com.mirtec.platformer;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame implements ApplicationListener {
	SpriteBatch batch;
	private ShapeRenderer shapeRenderer;
//	Texture img;
	int playerX;
	int playerY;
	int playerSpeed;

	@Override
	public void create () {
		batch = new SpriteBatch();
		shapeRenderer = new ShapeRenderer();
		// Let's create a player rectangle and draw it to the screen.
		// How about green?
		playerX = 10;
		playerY = 20;
		playerSpeed = 10;
	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 1);
//		batch.begin();
//		batch.end();

		// Movement

		if (Gdx.input.isKeyPressed(Input.Keys.A)) {
			playerX -= playerSpeed;
		}
		if (Gdx.input.isKeyPressed(Input.Keys.D)) {
			playerX += playerSpeed;
		}

		// Drawing
		shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
		shapeRenderer.setColor(Color.GREEN);
		shapeRenderer.rect(playerX, playerY, 32, 32);
		shapeRenderer.end();
	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void dispose () {
		batch.dispose();
//		img.dispose();
		shapeRenderer.dispose();
	}
}
