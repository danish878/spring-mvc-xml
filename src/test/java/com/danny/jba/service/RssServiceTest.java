package com.danny.jba.service;

import com.danny.jba.entity.Item;
import com.danny.jba.exception.RssException;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RssServiceTest {

    private RssService rssService;

    @Before
    public void setUp() {
        rssService = new RssService();
    }

    @Test
    public void getItemsFromFileTest() throws RssException {
        List<Item> items = rssService.getItems(new File("test-rss/javavids.xml"));
        assertEquals(10, items.size());
        Item firstItem = items.get(0);
        assertEquals("How to solve Source not found error during debug in Eclipse", firstItem.getTitle());
        assertEquals("23 06 2014 00:35:49", new SimpleDateFormat("dd MM yyyy HH:mm:ss").format(firstItem.getPublishedDate()));
    }

    @Test
    public void getItemsFromUrlJavaVidsTest() throws RssException {
        List<Item> items = rssService.getItems("http://feeds.feedburner.com/javavids?format=xml");
        assertEquals(10, items.size());
        Item firstItem = items.get(0);
        assertEquals("How to solve Source not found error during debug in Eclipse", firstItem.getTitle());
        assertEquals("23 06 2014 00:35:49", new SimpleDateFormat("dd MM yyyy HH:mm:ss").format(firstItem.getPublishedDate()));
    }

    @Test
    public void getItemsFromUrlJavaWorldTest() throws RssException {
        List<Item> items = rssService.getItems("https://www.javaworld.com/category/core-java/index.rss");
        assertEquals(20, items.size());
        Item firstItem = items.get(0);
        assertEquals("Java 101: Java polymorphism and its types", firstItem.getTitle());
        assertEquals("30 05 2019 21:54:00", new SimpleDateFormat("dd MM yyyy HH:mm:ss").format(firstItem.getPublishedDate()));
    }
}