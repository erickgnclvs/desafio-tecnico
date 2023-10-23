/*
 * XML Type:  estadoCivil
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.EstadoCivil
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo;


/**
 * An XML estadoCivil(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public interface EstadoCivil extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EstadoCivil.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC0155BB0B18E3286864972FF633C0AFE").resolveHandle("estadocivil2813type");
    
    /**
     * Gets the "cdestadocivil" element
     */
    short getCdestadocivil();
    
    /**
     * Gets (as xml) the "cdestadocivil" element
     */
    org.apache.xmlbeans.XmlShort xgetCdestadocivil();
    
    /**
     * True if has "cdestadocivil" element
     */
    boolean isSetCdestadocivil();
    
    /**
     * Sets the "cdestadocivil" element
     */
    void setCdestadocivil(short cdestadocivil);
    
    /**
     * Sets (as xml) the "cdestadocivil" element
     */
    void xsetCdestadocivil(org.apache.xmlbeans.XmlShort cdestadocivil);
    
    /**
     * Unsets the "cdestadocivil" element
     */
    void unsetCdestadocivil();
    
    /**
     * Gets the "deestadocivilfem" element
     */
    java.lang.String getDeestadocivilfem();
    
    /**
     * Gets (as xml) the "deestadocivilfem" element
     */
    org.apache.xmlbeans.XmlString xgetDeestadocivilfem();
    
    /**
     * True if has "deestadocivilfem" element
     */
    boolean isSetDeestadocivilfem();
    
    /**
     * Sets the "deestadocivilfem" element
     */
    void setDeestadocivilfem(java.lang.String deestadocivilfem);
    
    /**
     * Sets (as xml) the "deestadocivilfem" element
     */
    void xsetDeestadocivilfem(org.apache.xmlbeans.XmlString deestadocivilfem);
    
    /**
     * Unsets the "deestadocivilfem" element
     */
    void unsetDeestadocivilfem();
    
    /**
     * Gets the "deestadocivilmasc" element
     */
    java.lang.String getDeestadocivilmasc();
    
    /**
     * Gets (as xml) the "deestadocivilmasc" element
     */
    org.apache.xmlbeans.XmlString xgetDeestadocivilmasc();
    
    /**
     * True if has "deestadocivilmasc" element
     */
    boolean isSetDeestadocivilmasc();
    
    /**
     * Sets the "deestadocivilmasc" element
     */
    void setDeestadocivilmasc(java.lang.String deestadocivilmasc);
    
    /**
     * Sets (as xml) the "deestadocivilmasc" element
     */
    void xsetDeestadocivilmasc(org.apache.xmlbeans.XmlString deestadocivilmasc);
    
    /**
     * Unsets the "deestadocivilmasc" element
     */
    void unsetDeestadocivilmasc();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static br.jus.tjsc.www.selo.EstadoCivil newInstance() {
          return (br.jus.tjsc.www.selo.EstadoCivil) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static br.jus.tjsc.www.selo.EstadoCivil newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (br.jus.tjsc.www.selo.EstadoCivil) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static br.jus.tjsc.www.selo.EstadoCivil parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (br.jus.tjsc.www.selo.EstadoCivil) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static br.jus.tjsc.www.selo.EstadoCivil parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.jus.tjsc.www.selo.EstadoCivil) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static br.jus.tjsc.www.selo.EstadoCivil parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.EstadoCivil) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static br.jus.tjsc.www.selo.EstadoCivil parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.EstadoCivil) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static br.jus.tjsc.www.selo.EstadoCivil parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.EstadoCivil) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static br.jus.tjsc.www.selo.EstadoCivil parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.EstadoCivil) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static br.jus.tjsc.www.selo.EstadoCivil parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.EstadoCivil) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static br.jus.tjsc.www.selo.EstadoCivil parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.EstadoCivil) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static br.jus.tjsc.www.selo.EstadoCivil parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.EstadoCivil) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static br.jus.tjsc.www.selo.EstadoCivil parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (br.jus.tjsc.www.selo.EstadoCivil) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static br.jus.tjsc.www.selo.EstadoCivil parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (br.jus.tjsc.www.selo.EstadoCivil) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static br.jus.tjsc.www.selo.EstadoCivil parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.jus.tjsc.www.selo.EstadoCivil) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static br.jus.tjsc.www.selo.EstadoCivil parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (br.jus.tjsc.www.selo.EstadoCivil) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static br.jus.tjsc.www.selo.EstadoCivil parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (br.jus.tjsc.www.selo.EstadoCivil) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.jus.tjsc.www.selo.EstadoCivil parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.jus.tjsc.www.selo.EstadoCivil) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static br.jus.tjsc.www.selo.EstadoCivil parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (br.jus.tjsc.www.selo.EstadoCivil) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
