/*
 * XML Type:  pais
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.Pais
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo;


/**
 * An XML pais(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public interface Pais extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Pais.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0155BB0B18E3286864972FF633C0AFE").resolveHandle("pais1eb3type");
    
    /**
     * Gets the "cdpais" element
     */
    short getCdpais();
    
    /**
     * Gets (as xml) the "cdpais" element
     */
    org.apache.xmlbeans.XmlShort xgetCdpais();
    
    /**
     * True if has "cdpais" element
     */
    boolean isSetCdpais();
    
    /**
     * Sets the "cdpais" element
     */
    void setCdpais(short cdpais);
    
    /**
     * Sets (as xml) the "cdpais" element
     */
    void xsetCdpais(org.apache.xmlbeans.XmlShort cdpais);
    
    /**
     * Unsets the "cdpais" element
     */
    void unsetCdpais();
    
    /**
     * Gets the "denacionalidadefeminina" element
     */
    java.lang.String getDenacionalidadefeminina();
    
    /**
     * Gets (as xml) the "denacionalidadefeminina" element
     */
    org.apache.xmlbeans.XmlString xgetDenacionalidadefeminina();
    
    /**
     * True if has "denacionalidadefeminina" element
     */
    boolean isSetDenacionalidadefeminina();
    
    /**
     * Sets the "denacionalidadefeminina" element
     */
    void setDenacionalidadefeminina(java.lang.String denacionalidadefeminina);
    
    /**
     * Sets (as xml) the "denacionalidadefeminina" element
     */
    void xsetDenacionalidadefeminina(org.apache.xmlbeans.XmlString denacionalidadefeminina);
    
    /**
     * Unsets the "denacionalidadefeminina" element
     */
    void unsetDenacionalidadefeminina();
    
    /**
     * Gets the "denacionalidademasc" element
     */
    java.lang.String getDenacionalidademasc();
    
    /**
     * Gets (as xml) the "denacionalidademasc" element
     */
    org.apache.xmlbeans.XmlString xgetDenacionalidademasc();
    
    /**
     * True if has "denacionalidademasc" element
     */
    boolean isSetDenacionalidademasc();
    
    /**
     * Sets the "denacionalidademasc" element
     */
    void setDenacionalidademasc(java.lang.String denacionalidademasc);
    
    /**
     * Sets (as xml) the "denacionalidademasc" element
     */
    void xsetDenacionalidademasc(org.apache.xmlbeans.XmlString denacionalidademasc);
    
    /**
     * Unsets the "denacionalidademasc" element
     */
    void unsetDenacionalidademasc();
    
    /**
     * Gets the "depais" element
     */
    java.lang.String getDepais();
    
    /**
     * Gets (as xml) the "depais" element
     */
    org.apache.xmlbeans.XmlString xgetDepais();
    
    /**
     * True if has "depais" element
     */
    boolean isSetDepais();
    
    /**
     * Sets the "depais" element
     */
    void setDepais(java.lang.String depais);
    
    /**
     * Sets (as xml) the "depais" element
     */
    void xsetDepais(org.apache.xmlbeans.XmlString depais);
    
    /**
     * Unsets the "depais" element
     */
    void unsetDepais();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.jus.tjsc.www.selo.Pais newInstance() {
          return (br.jus.tjsc.www.selo.Pais) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.jus.tjsc.www.selo.Pais newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.jus.tjsc.www.selo.Pais) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.jus.tjsc.www.selo.Pais parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.jus.tjsc.www.selo.Pais) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.jus.tjsc.www.selo.Pais parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.jus.tjsc.www.selo.Pais) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.jus.tjsc.www.selo.Pais parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.Pais) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.jus.tjsc.www.selo.Pais parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.Pais) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.jus.tjsc.www.selo.Pais parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.Pais) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.jus.tjsc.www.selo.Pais parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.Pais) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.jus.tjsc.www.selo.Pais parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.Pais) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.jus.tjsc.www.selo.Pais parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.Pais) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.jus.tjsc.www.selo.Pais parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.Pais) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.jus.tjsc.www.selo.Pais parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.Pais) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.jus.tjsc.www.selo.Pais parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.jus.tjsc.www.selo.Pais) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.jus.tjsc.www.selo.Pais parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.jus.tjsc.www.selo.Pais) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.jus.tjsc.www.selo.Pais parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.jus.tjsc.www.selo.Pais) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.jus.tjsc.www.selo.Pais parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.jus.tjsc.www.selo.Pais) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.jus.tjsc.www.selo.Pais parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.jus.tjsc.www.selo.Pais) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.jus.tjsc.www.selo.Pais parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.jus.tjsc.www.selo.Pais) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
